package org.cqu.include_api;

import org.cqu.pojo.Include;

import java.util.List;

public interface IncludeService {
    List<Integer> findDistinctCID();
    List<Integer> findMCountByCID(Integer cid);

}
