package org.cqu.ui.controller;


import org.apache.dubbo.config.annotation.Reference;
import org.cqu.car.service.CarService;
import org.cqu.dto.ResultInfo;
import org.cqu.pojo.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/CarAPI")
public class CarController {
    @Reference
    private CarService carService;    // 调用dubbo服务, 注意必须先启动服务car_service 且在dubbo-admin中看到服务

    @RequestMapping("/GetCarName/")
    public String getCarName(int CarID){        // 前端传来参数 /CarAPI/GetCarName/?CarID=352 可以找到
        return carService.getCarName(CarID);    // 前端传来参数 /CarAPI/GetCarName/?CarID=1000 找不到
    }

    @RequestMapping("/GetCarInfo")
    public ResultInfo<Car> getCarInfo(int id) {
        ResultInfo<Car> res = new ResultInfo<Car>();
        Car car = carService.getCarInfo(id);
        String nginx_info = "http://116.63.170.243:8888/";
        car.setCpic1(nginx_info+car.getCpic1());
        car.setCpic2(nginx_info+car.getCpic2());
        car.setCpic3(nginx_info+car.getCpic3());
        car.setCpic4(nginx_info+car.getCpic4());
        car.setCpic5(nginx_info+car.getCpic5());
        res.setDetail(car);
        return res;
    }

    @RequestMapping("/GetRandomCar")
    public ResultInfo<Car> getRandomCar(){
        ResultInfo<Car> res = new ResultInfo<>();
        List<Car> random_cars = carService.getRandomCar();
        res.setResult_list(random_cars);
        return res;
    }

    @RequestMapping("GetSellersCars")
    public ResultInfo<Car> getSellersCars(String sname) {
        ResultInfo<Car> res = new ResultInfo<>();
        List<Car> cars= carService.getCarsByType(sname);
        String nginx_info = "http://116.63.170.243:8888/";
        for (Car car : cars) {
            car.setCpic1(nginx_info + car.getCpic1());
        }
        res.setResult_list(cars);
        return res;
    }

//    @RequestMapping("/UploadNewCar")
//    public int uploadNewCar(String CName, float CPrice, int CSpeed, String CFuel, String CType,
//                            String CGear, int Cwarranty, int Ctank_capacity, float CAcceleration,
//                            String CPic1, String CPic2, String CPic3, String CPic4, String CPic5) {
//        return carService.uploadNewCar(CName, CPrice, CSpeed, CFuel, CType,
//                CGear, Cwarranty, Ctank_capacity, CAcceleration,
//                CPic1, CPic2, CPic3, CPic4, CPic5);
//    }

}
