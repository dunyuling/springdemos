package com.rc.aop.pattern.proxy;

/**
 * @ClassName RealSubject
 * @Description 目标对象类
 * @Author liux
 * @Date 19-4-17 下午4:13
 * @Version 1.0
 */
public class RealSubject implements Subject {


    @Override
    public void request() {
        System.out.println("real subject execute request");
    }
}
