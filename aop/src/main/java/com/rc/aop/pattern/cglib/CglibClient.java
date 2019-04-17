package com.rc.aop.pattern.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @ClassName CglibClient
 * @Description cglib客户端实现类
 * @Author liux
 * @Date 19-4-17 下午5:40
 * @Version 1.0
 */
public class CglibClient {

    public static void main(String[] args) {
        CglibSubject cglibSubject = (CglibSubject) Enhancer.create(CglibRealSubject.class,
                new CglibMethodInterceptor());

        cglibSubject.request();
        System.out.println();
        cglibSubject.hello();
    }
}