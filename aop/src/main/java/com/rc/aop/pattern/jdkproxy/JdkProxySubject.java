package com.rc.aop.pattern.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName JdkProxySubject
 * @Description jdk动态代理实现类
 * @Author liux
 * @Date 19-4-17 下午4:30
 * @Version 1.0
 */
public class JdkProxySubject implements InvocationHandler {

    private JdkRealSubject jdkRealSubject;

    public JdkProxySubject(JdkRealSubject jdkRealSubject) {
        this.jdkRealSubject = jdkRealSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass());
        System.out.println("#### jdk proxy before");
        Object result;
        try {
            result = method.invoke(jdkRealSubject,args);
        } catch (Exception e) {
            System.out.println("#### ex: " + e.getMessage());
            throw e;
        } finally {
            System.out.println("#### jdk proxy after");
        }
        return result;
    }
}
