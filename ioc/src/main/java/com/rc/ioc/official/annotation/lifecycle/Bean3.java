package com.rc.ioc.official.annotation.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName Bean3
 * @Description 生命周期中的方法
 * @Author liux
 * @Date 19-3-31 下午3:15
 * @Version 1.0
 */
public class Bean3 {

    @PostConstruct
    public void postConstruct() {
        System.out.println("Bean3 PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Bean3 PreDestroy");
    }
}
