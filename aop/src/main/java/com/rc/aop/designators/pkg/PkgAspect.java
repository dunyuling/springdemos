package com.rc.aop.designators.pkg;

import com.rc.aop.designators.BaseAspect;
import com.rc.aop.designators.IAspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName PkgAspect
 * @Description com.rc.aop.designators--匹配包/类型--切面类
 * @Author liux
 * @Date 19-4-16 下午5:38
 * @Version 1.0
 */
@Aspect
@Component
public class PkgAspect extends BaseAspect implements IAspect {

    //匹配PkgService里的所有方法
//    @Pointcut("within(com.rc.aop.com.rc.aop.designators.pkg.PkgService)")
    //匹配com.rc.aop.com.rc.aop.designators.pkg包及其子包下的所有方法
    @Pointcut("within(com.rc.aop.designators.pkg.*)")
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