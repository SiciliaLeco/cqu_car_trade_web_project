package com.example.mapper;

import com.example.pojo.Include;
import com.example.pojo.IncludeExample;
import com.example.pojo.IncludeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IncludeMapper {
    int countByExample(IncludeExample example);

    int deleteByExample(IncludeExample example);

    int deleteByPrimaryKey(IncludeKey key);

    int insert(Include record);

    int insertSelective(Include record);

    List<Include> selectByExample(IncludeExample example);

    Include selectByPrimaryKey(IncludeKey key);

    int updateByExampleSelective(@Param("record") Include record, @Param("example") IncludeExample example);

    int updateByExample(@Param("record") Include record, @Param("example") IncludeExample example);

    int updateByPrimaryKeySelective(Include record);

    int updateByPrimaryKey(Include record);
}