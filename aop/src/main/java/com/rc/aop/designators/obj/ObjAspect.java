package com.rc.aop.designators.obj;

import com.rc.aop.designators.BaseAspect;
import com.rc.aop.designators.IAspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName ObjAspect
 * @Description com.rc.aop.designators--匹配对象--切面类
 * @Author liux
 * @Date 19-4-16 下午5:57
 * @Version 1.0
 */
@Aspect
@Component
public class ObjAspect extends BaseAspect implements IAspect {

    //匹配AOP对象的目标对象为指定类型的方法，即 ObjService 的aop代理对象的方法
    @Pointcut("this(com.rc.aop.designators.obj.ObjService)")
    //匹配实现 IObjService 接口的目标对象(而不是aop代理后的对象)的方法，这里即 OjbService2 的方法
//    @Pointcut("target(com.rc.aop.com.rc.aop.designators.obj.IObjService)")
    //匹配所有以Service结尾的bean里头的方法
//    @Pointcut("bean(objService)")
    public void pointMethod() {

    }

    @Before("pointMethod()")
    public void adviceBeforeMethod() {
        this.beforeMethod();
    }

    @After("pointMethod()")
    public void adviceAfterMethod() {
        super.afterMethod();
    }
}