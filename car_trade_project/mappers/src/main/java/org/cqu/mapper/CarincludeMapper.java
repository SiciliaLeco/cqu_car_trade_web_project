package org.cqu.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.cqu.pojo.Carinclude;
import org.cqu.pojo.CarincludeExample;
import org.cqu.pojo.CarincludeKey;

public interface CarincludeMapper {
    int countByExample(CarincludeExample example);

    int deleteByExample(CarincludeExample example);

    int deleteByPrimaryKey(CarincludeKey key);

    int insert(Carinclude record);

    int insertSelective(Carinclude record);

    List<Carinclude> selectByExample(CarincludeExample example);

    Carinclude selectByPrimaryKey(CarincludeKey key);

    int updateByExampleSelective(@Param("record") Carinclude record, @Param("example") CarincludeExample example);

    int updateByExample(@Param("record") Carinclude record, @Param("example") CarincludeExample example);

    int updateByPrimaryKeySelective(Carinclude record);

    int updateByPrimaryKey(Carinclude record);
}