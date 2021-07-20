package org.cqu.car.service;

import org.cqu.pojo.Car;

public interface CarService {
    String getCarName(int CarID);
    String setCarName(int CarID, String Cname);
    Car getCarInfo(int CarID);
}
