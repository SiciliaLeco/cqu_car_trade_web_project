package org.cqu.cart.cart_service;

import org.apache.dubbo.config.annotation.Service;
import org.cqu.cart_api.CartService;
import org.cqu.dto.ResultInfo;
import org.cqu.mapper.CartMapper;

import org.cqu.pojo.Cart;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.sql.Timestamp;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartMapper cartMapper;

    private ResultInfo<Cart> result = new ResultInfo<>();

    public ResultInfo<Cart> insert(Integer CartID, Timestamp date, Integer price, String btel){
        Cart new_cart = new Cart();
        new_cart.setCartid(CartID);
        new_cart.setCartdate(date);
        new_cart.setCartprice(price);
        new_cart.setBtel(btel);
        cartMapper.insert(new_cart);
        result.setDetail(new_cart);
        return result;
    }
}
