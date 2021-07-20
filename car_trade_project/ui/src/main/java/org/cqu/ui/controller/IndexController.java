package org.cqu.ui.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.dubbo.config.annotation.Reference;
import org.cqu.cache_api.CacheService;
import org.cqu.car.service.CarService;
import org.cqu.dto.Node;
import org.cqu.include_api.IncludeService;
import org.cqu.pojo.Car;
import org.cqu.pojo.Include;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

@RestController
@RequestMapping("/Index")
public class IndexController {
    @Reference
    private CacheService cacheService;

    @Reference
    private IncludeService includeService;

    @Reference
    private CarService carService;

    @RequestMapping("/findTop6Car")
    public List<Car> findTop6Car() {

        Comparator<Node> CarComparator = new Comparator<Node>() {
            // 自定义Node类型的compare
            @Override
            public int compare(Node n1, Node n2) {
                return n1.getSellAmount() - n2.getSellAmount();
            }
        };

        List<Car> top6Car = null;
        String data = cacheService.getDataByKey("top6Car");
        if (data == null) {
            synchronized (this) {
                if (cacheService.getDataByKey("top6Car") == null) {
                    /**
                     * 首先获得所有无重复的CID，然后根据CID的值获得对应的销量Integer
                     * 根据<CID, 销量> 排序，并且获得top6
                     * */
                    List<Integer> CID_List = includeService.findDistinctCID();
                    PriorityQueue<Node> cid_to_sellAmount = new PriorityQueue<>(CarComparator);
                    for (Integer cid : CID_List) {
                        Integer total_count = includeService.findMCountByCID(cid);
                        Node curr_node = new Node(cid, total_count);
                        cid_to_sellAmount.add(curr_node);
                    }
                    for (int i = 0; i < 6; i++) {
                        Car cur_car = carService.getCarInfo(cid_to_sellAmount.remove().getCid());
                        top6Car.add(cur_car);
                    }
                    cacheService.insertCache("top6Car", JSONObject.toJSON(top6Car).toString());
                }
            }
        } else {
            top6Car = JSON.parseArray(data, Car.class);
        }
        /**
         * 在后台打印top6销量的车
        * */
        for (Car car : top6Car) {
            System.out.println(car.getCname());
        }
        return top6Car;
    }
}
