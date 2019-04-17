package com.rc.aop.designators.execution;

import com.rc.aop.designators.BaseAspect;
import com.rc.aop.designators.IAspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName ExecutionAspect
 * @Description com.rc.aop.designators--匹配表达式--切面类
 * @Author liux
 * @Date 19-4-17 下午12:37
 * @Version 1.0
 */
@Aspect
@Component
public class ExecutionAspect extends BaseAspect implements IAspect {


//    标注问号代表可以省略
//    execution(
//            modifier-pattern?
//            ret-type-pattern
//            declaring-type-pattern? 包名
//            name-pattern(param-pattern)
//            throws pattern?
//    )
    @Override
    @Pointcut("execution(public * com.rc.aop.designators.execution.*Service.*(..))")
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