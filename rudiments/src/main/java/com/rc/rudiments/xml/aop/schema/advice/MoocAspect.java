package com.rc.rudiments.xml.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @ClassName MoocAspect
 * @Description MoocAspect类
 * @Author liux
 * @Date 19-4-23 下午12:00
 * @Version 1.0
 */
public class MoocAspect {



    public void before() {
        System.out.println("MoocAspect before.");
    }

    public void afterReturning(String returnVal) {
        System.out.println("MoocAspect afterReturning. " + returnVal);
    }

    public void afterThrowing() {
        System.out.println("MoocAspect afterThrowing.");
    }

    public void after() {
        System.out.println("MoocAspect after.");
    }

    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("MoocAspect around 1.");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("MoocAspect around 2.");
        return obj;
    }

    /*
     * @Author liux
     * @Description Advice parameters
     * @Date 19-4-23 下午4:51
     * @param proceedingJoinPoint
     * @param bizName
     * @param times
     * @return java.lang.Object
     **/
    public Object aroundInit(ProceedingJoinPoint proceedingJoinPoint, String bizName, int times) throws Throwable {
        System.out.println("bizName: " + bizName + "\t times: " + times);
        System.out.println("MoocAspect aroundInit 1.");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("MoocAspect aroundInit 2.");
        return obj;
    }
}