package com.rc.rudiments.xml.aop.api;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.lang.NonNull;

import java.lang.reflect.Method;

/**
 * @ClassName MoocAfterReturningAdvice
 * @Description 自定义返回通知
 * @Author liux
 * @Date 19-4-23 下午6:50
 * @Version 1.0
 */
public class MoocAfterReturningAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, @NonNull Method method,
                               @NonNull Object[] args, Object target) throws Throwable {
        System.out.println("MoocAfterReturningAdvice : " + method.getName() + "\t" +
                target.getClass().getName() + "\t" + returnValue);
    }
}
