package org.cqu.car.serviceImpl;

import org.apache.dubbo.config.annotation.Service;
import org.cqu.mapper.CarMapper;
import org.cqu.pojo.Car;
import org.cqu.car.service.CarService;
import org.cqu.pojo.CarExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

import static java.lang.Integer.max;
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
        carid_list.add(3298);carid_list.add(3481);carid_list.add(4232);
        carid_list.add(4820);carid_list.add(5810);carid_list.add(5884);
        carid_list.add(6048);carid_list.add(564);carid_list.add(3121);
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

    @Override
    public List<Car> getCarsByType(String CType) {
        CarExample carExample = new CarExample();
        carExample.createCriteria().andCtypeEqualTo(CType);
        return carMapper.selectByExample(carExample);
    }

//    @Override
//    public int uploadNewCar(String CName, float CPrice, int CSpeed, String CFuel, String CType,
//                            String CGear, int Cwarranty, int Ctank_capacity, float CAcceleration,
//                            String CPic1, String CPic2, String CPic3, String CPic4, String CPic5) {
//        Car newCar = new Car();
//        newCar.setCname(CName);
//        newCar.setCprice(CPrice);
//        newCar.setCspeed(CSpeed);
//        newCar.setCfuel(CFuel);
//        newCar.setCtype(CType);
//        newCar.setCgear(CGear);
//        newCar.setCwarranty(Cwarranty);
//        newCar.setCtankCapacity(Ctank_capacity);
//        newCar.setCacceleration(CAcceleration);
//        newCar.setCpic1(CPic1);
//        newCar.setCpic2(CPic2);
//        newCar.setCpic3(CPic3);
//        newCar.setCpic4(CPic4);
//        newCar.setCpic5(CPic5);
//
//        CarExample carExample = new CarExample();
//        List<Car> allCars = carMapper.selectByExample(carExample);
//        int maxCID = 0;
//        for (Car car: allCars) {
//            maxCID = max(maxCID, car.getCid());
//        }
//        newCar.setCid(maxCID+1);
//
//        return carMapper.insert(newCar);
//    }

}
