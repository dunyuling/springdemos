package com.rc.ioc.official.xml.lifecycle;

/**
 * @ClassName Bean
 * @Description 测试Bean的生命周期-通过方法
 * @Author liux
 * @Date 19-3-30 上午11:53
 * @Version 1.0
 */
public class Bean {

    public void onInit() {
        System.out.println("Bean.onInit");
    }

    public void onDestroy() {
        System.out.println("Bean.onDestroy");
    }
}
