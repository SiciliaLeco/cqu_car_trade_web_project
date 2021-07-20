package org.cqu.include.service;
import org.cqu.pojo.Include;

import java.util.List;

public interface IncludeService {
    List<Include> findDistinctCID();
    List<Include> findMCountByCID(Integer cid);
}
