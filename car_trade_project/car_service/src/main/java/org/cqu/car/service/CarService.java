package org.cqu.car.service;

import org.cqu.dto.ResultInfo;
import org.cqu.pojo.Car;

import java.util.List;

public interface CarService {
    String getCarName(int CarID);
    String setCarName(int CarID, String Cname);
    Car getCarInfo(int CarID);
    List<Car> getRandomCar();
}
