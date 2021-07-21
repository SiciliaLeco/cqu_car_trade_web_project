package org.cqu.ui.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.apache.dubbo.config.annotation.Reference;
import org.cqu.dto.ResultInfo;
import org.cqu.pojo.Seller;
import org.cqu.seller_api.SellerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/SellerAPI")
public class SellerController {

    @Reference
    private SellerService sellerService;
    @PostMapping(value = "/login")
    public ResultInfo<Seller> login(String Username, String Password) {
        System.out.println("LOGIN ON BUYER TEL " + Username);
        System.out.println("LOGIN ON BUYER PASSWORD " + Password);
        return sellerService.login("023-89081126", "123456");
    }
//
    @PostMapping(value =  "/regist")
    public ResultInfo<Seller> regist(String Username, String Address, String Tel, String Password) {
        return sellerService.register("test", "test", "test", "test");
    }

    @PostMapping(value = "/updateUserInfo")
    public ResultInfo<Seller> updateUserInfo(String tel, String address, String name) {
        return sellerService.update(tel, name, address);
    }


    @RequestMapping(value = "/getSellerInfo")
    public Map<String, String> getUserInfo() {
        return sellerService.getInfo("023-89081126");
    }

    @RequestMapping(value = "/getAll")
    public ResultInfo<Seller> getAll(){
        List<Seller> list = sellerService.getAll();

    }
}
