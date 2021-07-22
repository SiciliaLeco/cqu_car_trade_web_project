package org.cqu.cart.cart_service;

import org.apache.dubbo.config.annotation.Service;
import org.cqu.cart_api.CartService;
import org.cqu.dto.ResultInfo;
import org.cqu.mapper.CartMapper;

import org.cqu.pojo.Cart;
import org.cqu.pojo.CartExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

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

    public Cart updatePrice(Integer CartID, Integer price) {
        CartExample ce = new CartExample();
        CartExample.Criteria criteria = ce.createCriteria();
        criteria.andCartidEqualTo(CartID);// 获取CartID等于当前值的订单
        List<Cart> curr_cart_list = cartMapper.selectByExample(ce);
        Cart cur_cart = curr_cart_list.get(0); // 38行返回的是列表，但是因为CartID是主码，所以列表只有一个数据，也就是我们需要找的数据
        cur_cart.setCartprice(price);
        cartMapper.updateByExample(cur_cart, ce);
        return cur_cart;
    }
}
