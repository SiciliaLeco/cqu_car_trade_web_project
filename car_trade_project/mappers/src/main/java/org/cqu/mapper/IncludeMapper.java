package org.cqu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.cqu.pojo.Include;
import org.cqu.pojo.IncludeExample;
import org.cqu.pojo.IncludeKey;
@Mapper
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