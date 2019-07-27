package com.rc.aopcache.service;

import com.rc.aopcache.component.ApplicationContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
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

    //以下两种方式都可以获取到 ApplicationContext 对象
    @Autowired
    ApplicationContextHolder applicationContextHolder;

    /*@Resource
    ApplicationContext context;*/

    @Cacheable(cacheNames = {"menu"})
    public List<String> getMenuList() {
        System.out.println("mock:get from db");
        return Arrays.asList("article", "comment", "admin");
    }


    //缓存可以无法工作
    void cacheNotWork() {
        System.out.println("call: " + getMenuList());
        //等价于
//        System.out.println("call: " + this.getMenuList());
    }

    //缓存可以正常工作,根据aop工作原理,直接使用代理类进行调用
    void cacheReWork() {
        MenuService proxy = applicationContextHolder.getContext()
                .getBean("menuService", MenuService.class);
        System.out.println("call: " + proxy.getMenuList());
    }
}
