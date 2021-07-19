package org.cqu.buyer_api;


import org.cqu.dto.ResultInfo;
import org.cqu.pojo.Buyer;

import java.util.Map;

public interface BuyerService {
    Buyer findBuyerByTel(String BuyerTel);
    String getBuyerName(String BuyerTel);
    ResultInfo<Buyer> login(String btel, String bpassword);
    ResultInfo<Buyer> register(Buyer buyer);
    ResultInfo<Buyer> update(String btel, String baddress, String bname);
    String getInfo(String btel);
}
