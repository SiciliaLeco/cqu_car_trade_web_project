//package org.cqu.ui.controller;
//
//
//import org.apache.dubbo.config.annotation.Reference;
//import org.cqu.car.service.CarService;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/CarAPI")
//public class CarController {
//    @Reference
//    private CarService carService;    // 调用dubbo服务, 注意必须先启动服务car_service 且在dubbo-admin中看到服务
//
//    @RequestMapping("/GetCarName/")
//    public String getCarName(int CarID){        // 前端传来参数 /CarAPI/GetCarName/?CarID=352 可以找到
//        return carService.getCarName(CarID);    // 前端传来参数 /CarAPI/GetCarName/?CarID=1000 找不到
//    }
//}
