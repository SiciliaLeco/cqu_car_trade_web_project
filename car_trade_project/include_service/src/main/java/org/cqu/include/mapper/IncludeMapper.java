package org.cqu.include.mapper;

import org.cqu.pojo.Include;

import java.util.List;

public interface IncludeMapper {
    List<Include> findDistinctCID();
    List<Include> findMCountByCID(Integer cid);
}
