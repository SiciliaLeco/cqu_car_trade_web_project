package com.example.teststatic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class disController {

    @RequestMapping("/get_id/")
    public int get_id(){
        return 100;
    }
}
