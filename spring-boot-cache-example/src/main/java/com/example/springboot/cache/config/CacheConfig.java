package com.example.springboot.cache.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
//enable caching
@EnableCaching
public class CacheConfig
{
    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager("studentInfo");
    }

}
