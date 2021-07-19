package org.cqu.ui.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.cqu.buyer_api.BuyerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/buyer_user_center")
public class disController {
    @Reference
    private BuyerService buyerService;

//    @RequestMapping("/login_register-buyer/login")
//    public String login(String Username, String Password){
//        String s = Username+"?"+Password+"?";
//        return s;
//    }
//    @RequestMapping("/login_register-buyer/register")
//    public String register(String Username, String Gender, String Address, String Tel, String Password){
//        String s = Username+"?"+Gender+"?"+Address+"?";
//        System.out.println(s);
//        return s;
//    }
//    @RequestMapping("buyer_user_center/update_buyer_info")
//    public String update_buyer_info(String Username, String Gender, String Address, String Tel){
//        String s = Username+"?"+Gender+"?"+Address+"?";
//        System.out.println(s);
//        return s;
//    }

    @RequestMapping(value = "/getUserInfo")
    public Map<String, String> getUserInfo() {
        return buyerService.getInfo("15998998970");
    }
}
