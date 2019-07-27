package com.rc.aopcache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName OutterService
 * @Description 用以测试外部调用缓存方法时,可以被aop拦截
 * @Author liux
 * @Date 19-7-27 下午1:29
 * @Version 1.0
 */
@Service
public class OutterService {

    @Autowired
    MenuService menuService;

    //缓存可以正常工作
    public void cacheWorkFromOutClass() {
        System.out.println(menuService.getMenuList());
    }
}
