package com.example.mapper;

import com.example.pojo.Seller;
import com.example.pojo.SellerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellerMapper {
    int countByExample(SellerExample example);

    int deleteByExample(SellerExample example);

    int deleteByPrimaryKey(String stel);

    int insert(Seller record);

    int insertSelective(Seller record);

    List<Seller> selectByExample(SellerExample example);

    Seller selectByPrimaryKey(String stel);

    int updateByExampleSelective(@Param("record") Seller record, @Param("example") SellerExample example);

    int updateByExample(@Param("record") Seller record, @Param("example") SellerExample example);

    int updateByPrimaryKeySelective(Seller record);

    int updateByPrimaryKey(Seller record);
}