package org.cqu.ui.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.cqu.backend_result.ResultBean;
import org.cqu.buyer_api.BuyerService;
import org.cqu.dto.ResultInfo;
import org.cqu.pojo.Buyer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        Buyer buyer = new Buyer();
        buyer.setBtel(Username);
        buyer.setBpassword(Password);
        return buyerService.login(buyer);
    }

    @PostMapping(value =  "/regist")
    public ResultInfo<Buyer> regist(String Username, String Gender, String Address, String Tel, String Password) {
        Buyer buyer = new Buyer();
        buyer.setBpassword(Password);
        buyer.setBtel(Tel);
        buyer.setBaddress(Address);
        buyer.setBname(Username);
        if(Gender == "Male"){
            buyer.setBgender(1);   // 1 for male and 0 for female
        } else {
            buyer.setBgender(0);
        }
        return buyerService.register(buyer);
    }
}
