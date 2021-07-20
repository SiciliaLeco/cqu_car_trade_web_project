package org.cqu.seller.seller_service;

import org.apache.dubbo.config.annotation.Service;
import org.cqu.dto.ResultInfo;
import org.cqu.mapper.SellerMapper;
import org.cqu.pojo.Seller;
import org.cqu.seller_api.SellerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

@Service
public class SellerServiceImpl implements SellerService {
    @Autowired
    SellerMapper sellerMapper;
    private ResultInfo<Seller> result = new ResultInfo<>();
    @Override
    public ResultInfo<Seller> login(String stel, String spassword){
        result.setIs_buyer(false);
        String token = "";
        try {
            Seller userExist = sellerMapper.selectByPrimaryKey(stel);
            if (userExist == null) {
                result.setMsg("Seller doesn't exist! Please retry!");
                result.setSuccess(false);
                result.setToken(token);
                result.setId("null");
            } else if (userExist.getSpassword().equals(spassword)){
                result.setMsg("Log in succeed!");
                result.setId(stel);
                result.setSuccess(true);
                token = result.generate_token(stel);
                result.setToken(token);
            } else {
                result.setMsg("password wrong! Please retry!");
                result.setSuccess(false);
                result.setToken(token);
                result.setId(stel);
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
    public ResultInfo<Seller> register(String stel, String sname, String spassword, String saddress){
        result.setToken("null");
        result.setIs_buyer(false);
        try {
            Seller name = sellerMapper.selectByPrimaryKey(stel);
            if (name != null) {
                result.setMsg("This phone number is used, please try another. ");
            } else {
                Seller new_regist = new Seller();
                new_regist.setSaddress(saddress);
                new_regist.setSname(sname);
                new_regist.setSpassword(spassword);
                new_regist.setStel(stel);
                sellerMapper.insert(new_regist);
                result.setMsg("Register success!");
                result.setSuccess(true);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
    @Override
    public ResultInfo<Seller> update(String stel, String sname, String saddress){
        result.setIs_buyer(false);
        Seller userExist = sellerMapper.selectByPrimaryKey(stel);
        userExist.setSaddress(saddress);
        userExist.setSname(sname);
        sellerMapper.updateByPrimaryKey(userExist);
        result.setMsg("update succeed!");
        result.setSuccess(true);
        return result;
    }
    @Override
    public Map<String, String> getInfo(String stel){
        result.setIs_buyer(false);
        Map<String, String> seller_info = new HashMap<String, String>();
        Seller seller = sellerMapper.selectByPrimaryKey(stel);
        seller_info.put("tel", seller.getStel());
        seller_info.put("name",seller.getSname());
        seller_info.put("address", seller.getSaddress());
        seller_info.put("grade", String.valueOf(seller.getSgrade()));
        return seller_info;

    }

}
