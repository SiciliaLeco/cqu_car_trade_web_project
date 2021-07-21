package org.cqu.ui.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/ShopCart")
public class ShopCartController {
    @RequestMapping(value = "/shopping")
    public Integer sendBuyingRecord(@RequestParam String inputStr, HttpServletRequest request){
        
    }
}
