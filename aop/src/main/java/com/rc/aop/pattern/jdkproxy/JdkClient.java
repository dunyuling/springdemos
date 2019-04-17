package com.rc.aop.pattern.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * @ClassName JdkClient
 * @Description jdk动态代理客户端类
 * @Author liux
 * @Date 19-4-17 下午4:43
 * @Version 1.0
 */
public class JdkClient {

    public static void main(String[] args) {
        //保存生成的动态代理类com.sun.proxy.$Proxy0
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        JdkSubject jdkSubject = (JdkSubject) Proxy.newProxyInstance(JdkClient.class.getClassLoader(),
                new Class[]{JdkSubject.class},
                new JdkProxySubject(new JdkRealSubject()));

        jdkSubject.request();
        System.out.println();
        jdkSubject.hello();
    }
}
