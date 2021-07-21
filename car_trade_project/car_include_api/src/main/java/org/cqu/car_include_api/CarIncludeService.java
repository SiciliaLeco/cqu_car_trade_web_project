package org.cqu.car_include_api;

import org.cqu.dto.ResultInfo;
import org.cqu.pojo.Carinclude;

public interface CarIncludeService {
    ResultInfo<Carinclude> insert(Integer cartid, Integer cid, Integer count);
}
