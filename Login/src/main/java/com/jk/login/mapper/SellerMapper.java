package com.jk.login.mapper;

import com.jk.login.pojo.Seller;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SellerMapper {
    List<Seller> find_all_sellers();
    Seller find_seller_by_tel(String seller_tel);
    Seller seller_login(Seller seller);
    void seller_register(Seller seller);
    void update_seller_password(Seller seller);
}
