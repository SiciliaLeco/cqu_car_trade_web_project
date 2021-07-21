package org.cqu.ui.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.cqu.car.service.CarService;
import org.cqu.car_include_api.CarIncludeService;
import org.cqu.cart_api.CartService;
import org.cqu.pojo.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.Math.round;

@RestController
@RequestMapping("/ShopCart")
public class ShopCartController {
    @Reference
    private CarService carService;

    @Reference
    private CartService cartService;

    @Reference
    private CarIncludeService carIncludeService;

    @RequestMapping(value = "/shopping")
    public float sendBuyingRecord(HttpServletRequest request){

        float totalCost = 0;
        String btel = request.getParameter("btel");
        String len = request.getParameter("cart_len");

        // 生成当前的时间，goodsC_date传入到数据库中
        Date date=new Date();//获取一个java.util包下的Date对象，存到数据库datetime类型中

        String timestamp = String.valueOf(date.getTime()/1000);
        Integer cart_id = Integer.valueOf(timestamp);
        
        String nowTime = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss").format(date);
        Timestamp goodsC_date =Timestamp.valueOf(nowTime);

        Integer size = 0;
        if(len != null){
            size = Integer.valueOf(len); // 获取订单内数据的个数
        }
        for(int i = 0;i < size; i++){
            String cid = request.getParameter("cart_"+String.valueOf(i));
            String count = request.getParameter("count_"+String.valueOf(i));

            Integer cur_cid = 0; Integer cur_count = 0;

            if(cid != null){
                cur_cid = Integer.valueOf(cid);
            }
            if(count != null){
                cur_count=Integer.valueOf(count);
            }

            Car cur_car = carService.getCarInfo(cur_cid);
            Integer cur_price = round(cur_car.getCprice());

            cartService.insert(cart_id, goodsC_date, cur_price, btel);
            carIncludeService.insert(cart_id, cur_cid, cur_count);

        }

        return totalCost;
    }
}
