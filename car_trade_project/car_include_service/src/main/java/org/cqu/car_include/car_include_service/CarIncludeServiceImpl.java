package org.cqu.car_include.car_include_service;

import org.apache.dubbo.config.annotation.Service;
import org.cqu.car_include_api.CarIncludeService;
import org.cqu.dto.ResultInfo;
import org.cqu.mapper.CarincludeMapper;
import org.cqu.pojo.Carinclude;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CarIncludeServiceImpl implements CarIncludeService {
    @Autowired
    private CarincludeMapper carincludeMapper;
    private ResultInfo<Carinclude> result = new ResultInfo<>();
    public ResultInfo<Carinclude> insert(Integer cartid, Integer cid, Integer count){
        Carinclude ci = new Carinclude();
        ci.setCartid(cartid);
        ci.setCid(cid);
        ci.setCount(count);
        carincludeMapper.insert(ci);
        result.setDetail(ci);
        return result;
    }
}
