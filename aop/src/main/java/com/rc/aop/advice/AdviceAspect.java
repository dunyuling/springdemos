package com.rc.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName AdviceAspect
 * @Description 5种advice的用法--切面类
 * @Author liux
 * @Date 19-4-17 下午1:27
 * @Version 1.0
 */
@Aspect
@Component
public class AdviceAspect {

    //before
    @Pointcut("execution(* com.rc.aop.advice.AdviceService.before(Long))")
    public void beforePointMethod() {

    }

    @Before("beforePointMethod() && args(userId)")
    public void beforeAdvice(Long userId) {
        System.out.println();
        System.out.println("###before " + userId);
    }

    //after
    @Pointcut("execution(* com.rc.aop.advice.AdviceService.after())")
    public void afterPointMethod() {

    }

    @After("afterPointMethod()")
    public void afterAdvice() {
        System.out.println("###after");
        System.out.println();
    }

    //afterReturning
    @Pointcut("execution(* com.rc.aop.advice.AdviceService.afterReturning())")
    public void afterReturningPointMethod() {

    }

    @AfterReturning(value = "afterReturningPointMethod()",returning = "returnedValue")
    public void afterReturningAdvice(String returnedValue) {
        System.out.println("###afterReturningPointMethod： " + returnedValue);
    }

    //afterThrowing
    @Pointcut("execution(* com.rc.aop.advice.AdviceService.afterThrowing())")
    public void afterThrowingPointMethod() {

    }

    @AfterThrowing(value = "afterThrowingPointMethod()")
    public void afterThrowingAdvice() {
        System.out.println("###afterThrowingPointMethod");
    }

    //Around
    @Pointcut(value="execution(* com.rc.aop.advice.AdviceService.around(String))")
    public void aroundPointMethod() {

    }

    @Around(value="aroundPointMethod()")
    public Object aroundAdvice(ProceedingJoinPoint joinpoint) {
        System.out.println("#####around before");
        Object result = null;
        try {
            result = joinpoint.proceed(joinpoint.getArgs());
            System.out.println("#####around returning");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("#####around exception");
        } finally {
            System.out.println("#####around finally");
        }
        return result;
    }
}