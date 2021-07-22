package org.cqu.buyer.buyer_service;

import org.apache.dubbo.config.annotation.Service;
import org.cqu.buyer_api.BuyerService;
import org.cqu.dto.HistoryOrder;
import org.cqu.dto.ResultInfo;
import org.cqu.mapper.BuyerMapper;
import org.cqu.mapper.CarMapper;
import org.cqu.mapper.CarincludeMapper;
import org.cqu.mapper.CartMapper;
import org.cqu.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.cqu.dto.ResultInfo.verifyToken;

@Service
public class BuyerServiceImpl implements BuyerService {
    @Autowired
    private BuyerMapper buyerMapper;
    @Autowired
    private CartMapper cartMapper;
    @Autowired
    private CarincludeMapper carincludeMapper;
    @Autowired
    private CarMapper carMapper;

    private ResultInfo<Buyer> result = new ResultInfo<>();

    @Override
    public Buyer findBuyerByTel(String BuyerTel) {
        return buyerMapper.selectByPrimaryKey(BuyerTel);
    }

    @Override
    public String getBuyerName(String BuyerTel) {
        Buyer buyer = buyerMapper.selectByPrimaryKey(BuyerTel);
        if(buyer != null){
            return buyer.getBname();
        }
        return "NotFound";
    }

    @Override
    public ResultInfo<Buyer> login(String btel, String bpassword) {
        String token = "";
        System.out.println(btel + " " + bpassword);
        try {
            Buyer userExist = buyerMapper.selectByPrimaryKey(btel);
            if (userExist == null) {
                result.setMsg("Buyer doesn't exist! Please retry!");
                result.setSuccess(false);
                result.setToken(token);
                result.setId("null");
            } else if (userExist.getBpassword().equals(bpassword)){
                result.setMsg("Log in succeed!");
                result.setId(btel);
                result.setSuccess(true);
                token = result.generate_token(btel);
                result.setToken(token);
            } else {
                result.setMsg("password wrong! Please retry!");
                result.setSuccess(false);
                result.setToken(token);
                result.setId(btel);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            result.setSuccess(false);
            result.setToken(token);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ResultInfo<Buyer> register(String Username, String Gender, String Address, String Tel, String Password) {
        Buyer buyer = new Buyer();
        buyer.setBpassword(Password);
        buyer.setBtel(Tel);
        buyer.setBaddress(Address);
        buyer.setBname(Username);
        if(Gender.equals("Male")){
            buyer.setBgender(1);   // 1 for male and 0 for female
        } else {
            buyer.setBgender(0);
        }
        result.setToken("null");
        try {
            /**
             * 手机号码作为登录的方式。如果手机号码已经被使用则注册失败：
             * 在数据库中查找是否有该手机号的用户，若无则注册成功。
             * */
            Buyer name = buyerMapper.selectByPrimaryKey(buyer.getBtel());
            if (name != null) {
                result.setMsg("This phone number is used, please try another. ");
                result.setSuccess(false);
            } else {
                buyerMapper.insert(buyer);
                result.setMsg("Register success!");
                result.setSuccess(true);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            result.setSuccess(false);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ResultInfo<Buyer> update(String btel, String baddress, String bname){
        Buyer userExist = buyerMapper.selectByPrimaryKey(btel);
        userExist.setBaddress(baddress);
        userExist.setBname(bname);
        buyerMapper.updateByPrimaryKey(userExist);
        result.setMsg("update succeed!");
        result.setSuccess(true);
        return result;
    }

    @Override
    public Map<String, String> getInfo(String btel){
        Map<String, String> buyer_info = new HashMap<String, String>();
        Buyer buyer = buyerMapper.selectByPrimaryKey(btel);
        buyer_info.put("tel", buyer.getBtel());
        buyer_info.put("name", buyer.getBname());
        buyer_info.put("address",buyer.getBaddress());
        buyer_info.put("gender",String.valueOf(buyer.getBgender()));
        buyer_info.put("vip", String.valueOf(buyer.getBvip()));
        return buyer_info;
    }



    @Override
    public void updateIcon(String btel, String pic_url) {
        Buyer userExist = buyerMapper.selectByPrimaryKey(btel);
        userExist.setBicon(pic_url);
        buyerMapper.updateByPrimaryKey(userExist);
    }

    @Override
    public HistoryOrder getHistoryOrder(String token) {
        HistoryOrder historyOrder = new HistoryOrder();

        String btel = verifyToken(token);
        if(btel == null) { // 如果token 验证失败了
            return null;
        }

        CartExample ce = new CartExample();
        ce.createCriteria().andBtelEqualTo(btel);
        List<Cart> history_info = cartMapper.selectByExample(ce); // 返回指定用户所有订单

        // 即将存入HistoryOrder的两张表
        List<List<Car>> car_list = new ArrayList<>();
        List<String> date_list = new ArrayList<>();

        for(Cart info : history_info) {
            List<Car> cars = new ArrayList<>();

            Integer cur_cartID = info.getCartid();
            date_list.add(info.getCartdate().toString());
            CarincludeExample cie = new CarincludeExample();
            cie.createCriteria().andCartidEqualTo(cur_cartID);
            List<Carinclude> cur_car_list = carincludeMapper.selectByExample(cie);
            for(Carinclude item : cur_car_list) {
                Integer cid = item.getCid();
                Car cur_car = carMapper.selectByPrimaryKey(cid);
                cur_car.setCpic1("http://116.63.170.243:8888/"+cur_car.getCpic1());
                cars.add(cur_car); // 订单中的表添加到cars列表中
            }
            car_list.add(cars);
        }

        historyOrder.setDate_list(date_list);
        historyOrder.setCars_list(car_list);
        return historyOrder;
    }
}