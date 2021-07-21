package org.cqu.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.cqu.pojo.Cart;
import org.cqu.pojo.CartExample;

public interface CartMapper {
    int countByExample(CartExample example);

    int deleteByExample(CartExample example);

    int insert(Cart record);

    int insertSelective(Cart record);

    List<Cart> selectByExample(CartExample example);

    int updateByExampleSelective(@Param("record") Cart record, @Param("example") CartExample example);

    int updateByExample(@Param("record") Cart record, @Param("example") CartExample example);
}