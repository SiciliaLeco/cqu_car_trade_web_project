package org.cqu.buyer_api;


import org.cqu.dto.HistoryOrder;
import org.cqu.dto.ResultInfo;
import org.cqu.pojo.Buyer;
import org.cqu.pojo.Cart;

import java.util.Map;

public interface BuyerService {
    Buyer findBuyerByTel(String BuyerTel);
    String getBuyerName(String BuyerTel);
    ResultInfo<Buyer> login(String btel, String bpassword);
    ResultInfo<Buyer> register(String Username, String Gender, String Address, String Tel, String Password);
    ResultInfo<Buyer> update(String btel, String bname, Integer Gender, String baddress);
    void updateIcon(String btel, String pic_url);
    HistoryOrder getHistoryOrder(String btel);
}
