package org.cqu.cart_api;

import org.cqu.dto.ResultInfo;
import org.cqu.pojo.Cart;
import java.sql.Timestamp;

public interface CartService {
    ResultInfo<Cart> insert(Integer CartID, Timestamp date, Integer price, String btel);
}
