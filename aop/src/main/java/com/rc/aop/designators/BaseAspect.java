package com.rc.aop.designators;

/**
 * @ClassName BaseAspect
 * @Description com.rc.aop.designators--切面类--基类
 * @Author liux
 * @Date 19-4-16 下午5:59
 * @Version 1.0
 */
public class BaseAspect {


    protected void beforeMethod() {
        System.out.println();
        System.out.println("######## before ########");
    }

    protected void afterMethod() {
        System.out.println("######## after ########");
        System.out.println();
    }
}