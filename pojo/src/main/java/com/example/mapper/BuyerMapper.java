package com.example.mapper;

import com.example.pojo.Buyer;
import com.example.pojo.BuyerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuyerMapper {
    int countByExample(BuyerExample example);

    int deleteByExample(BuyerExample example);

    int deleteByPrimaryKey(String btel);

    int insert(Buyer record);

    int insertSelective(Buyer record);

    List<Buyer> selectByExample(BuyerExample example);

    Buyer selectByPrimaryKey(String btel);

    int updateByExampleSelective(@Param("record") Buyer record, @Param("example") BuyerExample example);

    int updateByExample(@Param("record") Buyer record, @Param("example") BuyerExample example);

    int updateByPrimaryKeySelective(Buyer record);

    int updateByPrimaryKey(Buyer record);
}