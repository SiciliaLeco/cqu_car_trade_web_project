package org.cqu.ui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ShopCart")
public class ShopCartController { 

    
    @RequestMapping(value = "/shopping")
    public Integer sendBuyingRecord(HttpServletRequest request){
        String len = request.getParameter("Length");
        Integer size = 0;
        List<String> carIDArr = new ArrayList<String>();
        if(len != null){
            size = Integer.valueOf(len);
        }
        for(int i=0;i<size;i++){
            carIDArr.add(request.getParameter("cart"+i));
        }

        System.out.println(len);
        return 100;
    }
}
