package org.cqu.car.serviceImpl;

import org.apache.dubbo.config.annotation.Service;
import org.cqu.car.mapper.CarMapper;
import org.cqu.car.pojo.Car;
import org.cqu.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;

import static java.lang.Integer.valueOf;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;

    @Override
    public String getCarName(int CarID) {
        Car car = carMapper.selectByPrimaryKey(CarID);
        String ret;
        System.out.println("DEBUG IN getCarName "+car);
        if(car != null){
            ret = car.getCname();
        } else {
            ret = "NotFound";
        }
        return ret;
    }

    @Override
    public String setCarName(int CarID, String Cname) {
//        carMapper.selectByPrimaryKey(CarID);
        return "Success";
    }
}
