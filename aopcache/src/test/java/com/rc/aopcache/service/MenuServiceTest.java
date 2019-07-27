package com.rc.aopcache.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName MenuServiceTest
 * @Description 菜单服务类---测试类
 * @Author liux
 * @Date 19-4-19 下午5:00
 * @Version 1.0
 */
@ContextConfiguration(locations = {"classpath:spring-cache.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MenuServiceTest {

    @Autowired
    MenuService menuService;

    @Test
    public void testCache() {
        System.out.println("first time  get from db");
        System.out.println("call: " + menuService.getMenuList());
        System.out.println();
        System.out.println("second time get from cache");
        System.out.println("call: " + menuService.getMenuList());
    }

    @Test
    public void testCacheNotWork() {
        System.out.println("first time  get from db");
        menuService.cacheNotWork();
        System.out.println();
        System.out.println("second time get from db");
        menuService.cacheNotWork();
    }

    @Test
    public void testCacheReWork() {
        System.out.println("first time  get from db");
        menuService.cacheReWork();
        System.out.println();
        System.out.println("second time get from cache");
        menuService.cacheReWork();
    }
}
