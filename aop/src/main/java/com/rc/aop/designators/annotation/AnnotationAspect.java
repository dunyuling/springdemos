package com.rc.aop.designators.annotation;

import com.rc.aop.designators.BaseAspect;
import com.rc.aop.designators.IAspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName AnnotationAspect
 * @Description com.rc.aop.designators--匹配注解--切面类
 * @Author liux
 * @Date 19-4-16 下午7:56
 * @Version 1.0
 */
@Aspect
@Component
public class AnnotationAspect extends BaseAspect implements IAspect {

    //匹配方法标有 @AnnotationDemo 的注解的方法
//    @Pointcut("@annotation(AnnotationDemo)")

    //TODO 非 spring 环境 匹配标注有 @NeedSecured 的类底下的方法，要求的annotation的RetentionPolicy级别为CLASS
    //TODO spring 环境 匹配标注有 @NeedSecured 的类底下的方法，要求的annotation的RetentionPolicy级别为CLASS或者RUNTIME
    @Pointcut("@within(com.rc.aop.designators.annotation.NeedSecured)")


    //匹配标注有 @NeedSecured 的类底下的方法，要求的annotation的RetentionPolicy级别为RUNTIME
//    @Pointcut("@target(com.rc.aop.com.rc.aop.designators.annotation.NeedSecured)")
    //匹配传入的参数标注有 @NeedSecured 注解的方法
//    @Pointcut("@args(com.rc.aop.com.rc.aop.designators.annotation.NeedSecured)")
    @Override
    public void pointMethod() {

    }

    @Override
    @Before("pointMethod()")
    public void adviceBeforeMethod() {
        this.beforeMethod();
    }

    @Override
    @After("pointMethod()")
    public void adviceAfterMethod() {
        this.afterMethod();
    }
}
