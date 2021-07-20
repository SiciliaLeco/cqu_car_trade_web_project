package org.cqu.include.include_service;

import org.apache.dubbo.config.annotation.Service;
import org.cqu.include_api.IncludeService;
import org.cqu.mapper.IncludeMapper;
import org.cqu.pojo.Include;
import org.cqu.pojo.IncludeExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class IncludeServiceImpl implements IncludeService {
    @Autowired
    IncludeMapper includeMapper;
    @Override
    public List<Integer> findDistinctCID(){
        IncludeExample ie = new IncludeExample();
        ie.setDistinct(true);
        List<Include> res = includeMapper.selectByExample(ie);
        Set<Integer> cid_set = new HashSet<>();
        for (Include i: res) {
            cid_set.add(i.getCid());
        }
        List<Integer> cid_distinct = new ArrayList<>(cid_set);
        return cid_distinct;
    }
    @Override
    public Integer findMCountByCID(Integer cid){
        IncludeExample ie = new IncludeExample();
        ie.createCriteria().andCidEqualTo(cid);
        List<Include> res = includeMapper.selectByExample(ie);

        Integer totalAmount = 0;
        for (Include i: res) {
            totalAmount += i.getMcount();
        }
        return totalAmount;
    }
}
