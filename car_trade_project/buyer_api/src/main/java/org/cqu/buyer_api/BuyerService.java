package org.cqu.buyer_api;


import org.cqu.dto.ResultInfo;
import org.cqu.pojo.Buyer;

public interface BuyerService {
    Buyer findBuyerByTel(String BuyerTel);
    String getBuyerName(String BuyerTel);
    ResultInfo<Buyer> login(Buyer buyer);
    ResultInfo<Buyer> register(Buyer buyer);
}
