package com.jk.login.conroller;

import com.jk.login.info.ResultInfo;
import com.jk.login.pojo.Seller;
import com.jk.login.service.SellerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value = "/seller")
//public class UserController {
//    @Autowired
//    UserService userService;
//
//    @PostMapping(value = "/regist")
//    public ResultInfo<User> regist(User user){
//        return userService.registUser(user);
//    }
//
//    @PostMapping(value = "/login")
//    public ResultInfo<User> login(User user){
//        return userService.loginUser(user);
//    }
//
//    @PostMapping(value = "/updateUserPassword")
//    public ResultInfo<User> updateUserPassword(User user){
//        return userService.updateUserPassword(user);
//    }
//}

public class SellerController {
    @Autowired
    SellerService sellerService;

    @PostMapping(value = "/regist")
    public ResultInfo<Seller> regist(Seller seller){
        return sellerService.seller_register(seller);
    }

    @PostMapping(value = "/login")
    public ResultInfo<Seller> login(Seller seller) {
        return sellerService.seller_login(seller);
    }

    @PostMapping(value = "/updateSellerPassword")
    public ResultInfo<Seller> updateSellerPassword(Seller seller) {
        return sellerService.update_seller_password(seller);
    }

}
