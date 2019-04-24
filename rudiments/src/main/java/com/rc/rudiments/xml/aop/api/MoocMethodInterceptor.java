package com.rc.rudiments.xml.aop.api;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @ClassName MoocMethodInterceptor
 * @Description 自定义环绕通知
 * @Author liux
 * @Date 19-4-23 下午6:56
 * @Version 1.0
 */
public class MoocMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("MoocMethodInterceptor 1 : " + invocation.getMethod().getName() + "\t" +
                invocation.getStaticPart().getClass().getName());
        Object obj = invocation.proceed();
        System.out.println("MoocMethodInterceptor 2 : " + obj);
        return obj;
    }
}
