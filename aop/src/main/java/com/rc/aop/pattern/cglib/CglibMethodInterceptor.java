package com.rc.aop.pattern.cglib;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName CglibMethodInterceptor
 * @Description cglib动态代理实现类
 * @Author liux
 * @Date 19-4-17 下午5:30
 * @Version 1.0
 */
public class CglibMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(o.getClass());
        System.out.println("#### cglib proxy before");
        Object result;
        try {
            result = methodProxy.invokeSuper(o, objects);
        } catch (Exception e) {
            System.out.println("#### ex: " + e.getMessage());
            throw e;
        } finally {
            System.out.println("#### cglib proxy after");
        }
        return result;
    }
}
