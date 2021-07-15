package com.jk.login.service;

import com.jk.login.info.ResultInfo;
import com.jk.login.mapper.SellerMapper;

import com.jk.login.pojo.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = RuntimeException.class)
public class SellerService {
    @Autowired
    SellerMapper sellerMapper;
    private ResultInfo<Seller> result = new ResultInfo<>();

    public ResultInfo<Seller> seller_register(Seller user) {
        try {
            /**
             * 手机号码作为登录的方式。如果手机号码已经被使用则注册失败：
             * 在数据库中查找是否有该手机号的用户，若无则注册成功。
             * */
            Seller name = sellerMapper.find_seller_by_tel(user.getSTel());
            if (name != null) {
                result.setMsg("该手机号已被使用，请重新输入手机号。");
            } else {
                sellerMapper.seller_register(user);
//                userMapper.registUser(user);
                result.setMsg("注册成功，请返回登陆页面登陆。");
                result.setSuccess(true);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }


    public ResultInfo<Seller> seller_login(Seller user) {
        String token = "";
        try {
            Seller userExist = sellerMapper.seller_login(user);
            if (userExist == null) {
                result.setMsg("Phone number is wrong. Please retry!");
                result.setSuccess(false);
                result.setToken(token);
            } else {
                result.setMsg("Log in succeed!");
                user.setSTel(user.getSTel());
                result.setSuccess(true);
                token = result.generate_token(user.getSTel()); // 登录成功，生成token并添加到result
                result.setToken(token);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            result.setSuccess(false);
            result.setToken(token);
            e.printStackTrace();
        }
        return result;
    }

    public ResultInfo<Seller> update_seller_password(Seller user){
        sellerMapper.update_seller_password(user);
        result.setMsg("修改成功");
        result.setSuccess(true);
        return result;
    }
}
