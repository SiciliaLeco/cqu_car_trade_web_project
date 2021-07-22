package org.cqu.dto;

import org.cqu.pojo.Car;
import org.cqu.pojo.Cart;

import java.util.Date;
import java.util.List;

public class HistoryOrder {
    List<String> date_list;
    List<List<Car>> cars_list;

    public List<String> getDate_list(){return date_list;}

    public void setDate_list(List<String> list){this.date_list = list;}

    public List<List<Car>> getCars_list(){return cars_list;}

    public void setCars_list(List<List<Car>> list) {this.cars_list = list;}



}
