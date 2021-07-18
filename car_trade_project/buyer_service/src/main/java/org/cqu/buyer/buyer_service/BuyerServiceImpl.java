package org.cqu.buyer.buyer_service;

import org.apache.dubbo.config.annotation.Service;
import org.cqu.buyer_api.BuyerService;
import org.cqu.mapper.BuyerMapper;
import org.cqu.pojo.Buyer;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BuyerServiceImpl implements BuyerService {
    @Autowired
    private BuyerMapper buyerMapper;

    @Override
    public Buyer findBuyerByTel(String BuyerTel) {
        return buyerMapper.selectByPrimaryKey(BuyerTel);
    }

    @Override
    public String getBuyerName(String BuyerTel) {
        Buyer buyer = buyerMapper.selectByPrimaryKey(BuyerTel);
        if(buyer != null){
            return buyer.getBname();
        }
        return "NotFound";
    }
}
