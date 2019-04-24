package com.rc.rudiments.xml.aop.api;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.NonNull;

import java.lang.reflect.Method;

/**
 * @ClassName MoocBeforeAdvice
 * @Description 自定义前置通知
 * @Author liux
 * @Date 19-4-23 下午6:37
 * @Version 1.0
 */
public class MoocBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(@NonNull Method method, @NonNull Object[] args, Object target) throws Throwable {
        System.out.println("MoocBeforeAdvice : " + method.getName() + "     " +
                target.getClass().getName());
    }
}
