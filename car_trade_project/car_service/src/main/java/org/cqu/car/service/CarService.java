package org.cqu.car.service;

import org.cqu.pojo.Car;

import java.util.List;

public interface CarService {
    String getCarName(int CarID);
    String setCarName(int CarID, String Cname);
    Car getCarInfo(int CarID);
    List<Car> getRandomCar();
    List<Car> getCarsByType(String CType);
//    int uploadNewCar(String CName, float CPrice, int CSpeed, String CFuel, String CType,
//                     String CGear, int Cwarranty, int Ctank_capacity, float CAcceleration,
//                     String CPic1, String CPic2, String CPic3, String CPic4, String CPic5);
}
