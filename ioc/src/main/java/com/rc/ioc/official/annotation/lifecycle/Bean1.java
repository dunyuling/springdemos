package com.rc.ioc.official.annotation.lifecycle;

/**
 * @ClassName Bean1
 * @Description TODO
 * @Author liux
 * @Date 19-3-31 下午2:51
 * @Version 1.0
 */
public class Bean1 {

    public void onInit() {
        System.out.println("Bean1.onInit");
    }

    public void onDestroy() {
        System.out.println("Bean1.onDestroy");
    }
}
