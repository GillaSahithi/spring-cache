package com.example.springcaching.caching;

import lombok.extern.slf4j.Slf4j;
import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomCacheEventLogger implements CacheEventListener<Object,Object> {

    @Override
    public void onEvent(CacheEvent cacheEvent){
        log.info("CacheEvent = {}, Key = {}, Oldvalue = {}, Newvalue = {}",
                cacheEvent.getType(),cacheEvent.getKey(),cacheEvent.getOldValue(),cacheEvent.getNewValue());
    }
}
