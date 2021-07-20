package org.cqu.include.serviceImpl;

import org.apache.dubbo.config.annotation.Service;
import org.cqu.include.mapper.IncludeMapper;
import org.cqu.include.service.IncludeService;
import org.cqu.pojo.Include;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class IncludeServiceImpl implements IncludeService {
    @Autowired
    private IncludeMapper includeMapper;

    public List<Include> findDistinctCID(){
        List<Include> cid_list = includeMapper.findDistinctCID();
        for(int i = 0; i < cid_list.size(); i++){
            System.out.println(cid_list.get(i).getCid());
        }
        return cid_list;
    }
    public List<Include> findMCountByCID(Integer cid){
        List<Include> cid_list = includeMapper.findMCountByCID(cid);
        for(int i = 0; i < cid_list.size(); i++){
            System.out.println(cid_list.get(i).getCid());
        }
        return cid_list;
    }
}
