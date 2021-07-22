package org.cqu.ui.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.cqu.backend_result.ResultBean;
import org.cqu.buyer_api.BuyerService;
import org.cqu.dto.HistoryOrder;
import org.cqu.dto.ResultInfo;
import org.cqu.pojo.Buyer;
import org.cqu.pojo.Cart;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/BuyerAPI")
public class BuyerController {
    @Reference
    private BuyerService buyerService;

    @RequestMapping("/GetBuyerName/")
    public String getBuyerName(String Btel){
        return buyerService.getBuyerName(Btel);
    }

    @RequestMapping("/nGetBuyer/")
    public ResultBean<String> nGetBuyer(String Btel){
        return new ResultBean<String>(buyerService.getBuyerName(Btel));
    }

    @RequestMapping("/GetBuyer/")
    public Buyer getBuyer(String Btel){
        return buyerService.findBuyerByTel(Btel);
    }
    @PostMapping(value = "/login")
    public ResultInfo<Buyer> login(String Username, String Password) {
        System.out.println("LOGIN ON BUYER TEL " + Username);
        System.out.println("LOGIN ON BUYER PASSWORD " + Password);
        return buyerService.login(Username, Password);
    }

    @PostMapping(value =  "/regist")
    public ResultInfo<Buyer> regist(String Username, String Gender, String Address, String Tel, String Password) {
        return buyerService.register(Username, Gender, Address, Tel, Password);
    }

    @PostMapping(value = "/updateUserInfo")
    public ResultInfo<Buyer> updateUserInfo(String btel, String bname, Integer Gender, String baddress) {
        return buyerService.update(btel, bname, Gender, baddress);
    }


    @RequestMapping(value = "/getUserInfo")
    public ResultInfo<Buyer> getUserInfo(String token) {
        String btel = ResultInfo.verifyToken(token);
        ResultInfo<Buyer> user = new ResultInfo<>();
        user.setDetail(buyerService.findBuyerByTel(btel));
        return user;
    }

    @RequestMapping(value = "/getUserOrder")
    public HistoryOrder getUserOrder(String token){
        return buyerService.getHistoryOrder(token);
    }

}
