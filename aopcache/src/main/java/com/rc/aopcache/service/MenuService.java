package com.rc.aopcache.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName MenuService
 * @Description 菜单服务类
 * @Author liux
 * @Date 19-4-19 下午4:28
 * @Version 1.0
 */
@Component
@EnableCaching
public class MenuService {

    @Cacheable(cacheNames={"menu"})
    public List<String> getMenuList() {
        System.out.println("mock:get from db");
        return Arrays.asList("article","comment","admin");
    }
}
