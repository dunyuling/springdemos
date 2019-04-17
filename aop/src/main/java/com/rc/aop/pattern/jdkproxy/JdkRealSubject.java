package com.rc.aop.pattern.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * @ClassName JdkRealSubject
 * @Description jdk目标对象类
 * @Author liux
 * @Date 19-4-17 下午4:36
 * @Version 1.0
 */
public class JdkRealSubject implements JdkSubject {

    @Override
    public void request() {
        System.out.println("jdk real subject execute request");
    }

    @Override
    public void hello() {
        System.out.println("jdk real subject execute hello");
    }
}