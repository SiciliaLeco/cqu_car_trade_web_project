package org.cqu.car.serviceImpl;

import org.apache.dubbo.config.annotation.Service;
import org.cqu.mapper.CarMapper;
import org.cqu.pojo.Car;
import org.cqu.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

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


    @Override
    public Car getCarInfo(int CarID) {
        return carMapper.selectByPrimaryKey(CarID);
    }

    @Override
    public List<Car> getRandomCar(){
        String nginx_info = "http://116.63.170.243:8888/";
        List<Integer> carid_list = new ArrayList<>();
        carid_list.add(3298);carid_list.add(3481);carid_list.add(4232);carid_list.add(4820);carid_list.add(5810);carid_list.add(5884);carid_list.add(6048);carid_list.add(564);carid_list.add(3121);
        List<Car> car_list = new ArrayList<>();
        for(Integer carid: carid_list){
            Car cur_car = carMapper.selectByPrimaryKey(carid);

            cur_car.setCpic1(nginx_info+cur_car.getCpic1());
            cur_car.setCpic2(nginx_info+cur_car.getCpic2());
            cur_car.setCpic3(nginx_info+cur_car.getCpic3());
            cur_car.setCpic4(nginx_info+cur_car.getCpic4());
            cur_car.setCpic5(nginx_info+cur_car.getCpic5());
            car_list.add(cur_car);
        }
        return car_list;


    }

}
