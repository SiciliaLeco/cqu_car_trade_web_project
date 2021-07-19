package org.cqu.buyer.buyer_service;

import org.apache.dubbo.config.annotation.Service;
import org.cqu.buyer_api.BuyerService;
import org.cqu.dto.ResultInfo;
import org.cqu.mapper.BuyerMapper;
import org.cqu.pojo.Buyer;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BuyerServiceImpl implements BuyerService {
    @Autowired
    private BuyerMapper buyerMapper;
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
    public ResultInfo<Buyer> login(Buyer buyer) {
        String token = "";
        String btel = buyer.getBtel();
        String bpassword = buyer.getBpassword();
        try {
            Buyer userExist = buyerMapper.selectByPrimaryKey(btel);
//            Buyer userExist = buyerMapper.seller_login(buyer);
            if (userExist == null) {
                result.setMsg("Buyer doesn't exist! Please retry!");
                result.setSuccess(false);
                result.setToken(token);
                result.setId("null");
            } else if (userExist.getBpassword().equals(bpassword)){
                result.setMsg("Log in succeed!");
                result.setId(btel);
//                buyer.setSTel(buyer.getSTel());
                result.setSuccess(true);
                token = result.generate_token(buyer.getBtel());
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
    public ResultInfo<Buyer> register(Buyer buyer) {
        result.setToken("null");
        try {
            /**
             * 手机号码作为登录的方式。如果手机号码已经被使用则注册失败：
             * 在数据库中查找是否有该手机号的用户，若无则注册成功。
             * */
            Buyer name = buyerMapper.selectByPrimaryKey(buyer.getBtel());
            if (name != null) {
                result.setMsg("This phone number is used, please try another. ");
            } else {
                buyerMapper.insert(buyer);
                result.setMsg("Register success!");
                result.setSuccess(true);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }




}
