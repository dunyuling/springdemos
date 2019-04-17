package com.rc.aop.designators.args;

import com.rc.aop.designators.BaseAspect;
import com.rc.aop.designators.IAspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName ArgAspect
 * @Description com.rc.aop.designators--匹配参数--切面类
 * @Author liux
 * @Date 19-4-16 下午6:19
 * @Version 1.0
 */
@Aspect
@Component
public class ArgAspect extends BaseAspect implements IAspect  {

    //匹配任何以find开头且只有Long参数的方法
//    @Pointcut("execution(* *..find*(Long))")
    //匹配只有一个Long参数的方法
//    @Pointcut("args(Long)")
    //匹配任何以find开头且第一个参数为Long型的方法
    @Pointcut("execution(* *..find*(Long,..))")
    //匹配第一个参数为Long型的方法
//    @Pointcut("args(Long,..)")
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