package org.cqu.car.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/goods")
@RestController
public class CarController {
//    //使用dubbo引用注解远程调用goodsService
//    @Reference
//    private GoodsService goodsService;
//    //远程调度图片服务
//    @Reference
//    private PictureService pictureService;
//    //远程调度商品类型服务
//    @Reference
//    private CategoryService categoryService;
//    //创建方法用于处理分页查询请求

    @RequestMapping("/")
    public int findPage(int pageNo,int pageSize){
        return 0;
    }
}
