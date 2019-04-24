package com.rc.rudiments.xml.aop.api;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.lang.NonNull;

import java.lang.reflect.Method;

/**
 * @ClassName MoocThrowsAdvice
 * @Description 自定义异常通知
 * @Author liux
 * @Date 19-4-23 下午6:44
 * @Version 1.0
 */
public class MoocThrowsAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception ex) throws Throwable {
        System.out.println("MoocThrowsAdvice afterThrowing 1");
    }

    public void afterThrowing(@NonNull Method method, @NonNull Object[] args,
                              Object target, Exception ex) throws Throwable {

        System.out.println("MoocThrowsAdvice afterThrowing 2 : " + method.getName() + "\t" +
                target.getClass().getName());
    }
}
