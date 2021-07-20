package org.cqu.cache_api;

// 缓存服务的接口

public interface CacheService {
    void insertCache(String key, String value);
    String getDataByKey(String key);
}
