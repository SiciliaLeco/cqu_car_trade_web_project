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
    public ResultInfo<Buyer> login(String btel, String bpassword) {
        Buyer buyer = new Buyer();
        buyer.setBtel(btel);
        buyer.setBpassword(bpassword);
        return buyerService.login(buyer);
    }

    @PostMapping(value =  "/regist")
    public ResultInfo<Buyer> regist(String btel, String bpassword, String baddress, String bname){
        Buyer buyer = new Buyer();
        buyer.setBpassword(bpassword);
        buyer.setBtel(btel);
        buyer.setBaddress(baddress);
        buyer.setBname(bname);
        return buyerService.register(buyer);
    }
}
