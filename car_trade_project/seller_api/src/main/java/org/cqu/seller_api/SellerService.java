package org.cqu.seller_api;

import org.cqu.dto.ResultInfo;
import org.cqu.pojo.Seller;

import java.util.Map;

public interface SellerService {
    ResultInfo<Seller> login(String stel, String spassword);
    ResultInfo<Seller> register(String stel, String sname, String spassword, String saddress);
    ResultInfo<Seller> update(String stel, String sname, String saddress);
    Map<String, String> getInfo(String stel);
}
