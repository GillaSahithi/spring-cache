package com.example.springcaching;

import com.example.springcaching.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import javax.cache.Cache;
import javax.cache.CacheManager;

@SpringBootApplication
@EnableCaching
public class SpringCachingApplication  {
    public static void main(String[] args) {
        SpringApplication.run(SpringCachingApplication.class, args);
    }
}
