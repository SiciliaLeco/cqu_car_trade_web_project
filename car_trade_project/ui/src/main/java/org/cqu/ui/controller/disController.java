package org.cqu.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login_register-buyer")
public class disController {

    @RequestMapping("/login")
    public String login(String Username, String Password){
        String s = Username+"?"+Password+"?";
        return s;
    }
    @RequestMapping("/register")
    public String register(String Username, String Gender, String Address, String Tel, String Password){
        String s = Username+"?"+Gender+"?"+Address+"?";
        System.out.println(s);
        return s;
    }
}
