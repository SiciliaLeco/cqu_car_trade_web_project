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
        String defaultAvatar = "http://116.63.170.243:8888/group2/M00/00/01/wKgCzWD5OM2AeKWMAAAPR6rnCVA389.jpg";
        buyer.setBicon(defaultAvatar);
        Integer defaultVIP = 0;
        buyer.setBvip(defaultVIP); // ?????????
        if(Gender.equals("Male")){
            buyer.setBgender(1);   // 1 for male and 0 for female
        } else {
            buyer.setBgender(0);
        }
        result.setToken("null");
        try {
            /**
             * ???????????????????????????????????????????????????????????????????????????????????????
             * ??????????????????????????????????????????????????????????????????????????????
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
    public ResultInfo<Buyer> update(String btel, String bname, Integer Gender, String baddress){
        Buyer userExist = buyerMapper.selectByPrimaryKey(btel);
        userExist.setBname(bname);
        userExist.setBgender(Gender);
        userExist.setBaddress(baddress);
        buyerMapper.updateByPrimaryKey(userExist);
        result.setMsg("update succeed!");
        result.setSuccess(true);
        return result;
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
        if(btel == null) { // ??????token ???????????????
            return null;
        }

        CartExample ce = new CartExample();
        ce.createCriteria().andBtelEqualTo(btel);
        List<Cart> history_info = cartMapper.selectByExample(ce); // ??????????????????????????????

        // ????????????HistoryOrder????????????
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
                cars.add(cur_car); // ????????????????????????cars?????????
            }
            car_list.add(cars);
        }

        historyOrder.setDate_list(date_list);
        historyOrder.setCars_list(car_list);
        return historyOrder;
    }
}