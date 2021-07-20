package org.cqu.cache.cache_service;

import org.cqu.cache_api.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class CacheServiceImpl implements CacheService {
    // 自动装配redisTemplate模板对象
    @Autowired
    private RedisTemplate<String, String> template;

    @Override
    public void insertCache(String key, String value){
    // json 对象存储到redis
        template.opsForValue().set(key, value);
    }

    @Override
    public String getDataByKey(String key){
        String data = (String) template.opsForValue().get(key); // 获得key对应value
        System.out.println(data);
        return data;
    }
}
