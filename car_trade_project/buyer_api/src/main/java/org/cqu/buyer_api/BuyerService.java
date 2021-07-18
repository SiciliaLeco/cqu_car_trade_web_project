package org.cqu.buyer_api;


import org.cqu.pojo.Buyer;

public interface BuyerService {
    Buyer findBuyerByTel(String BuyerTel);
    String getBuyerName(String BuyerTel);
}
