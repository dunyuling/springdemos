package com.rc.rudiments.xml.aop.aspectj;

import com.rc.rudiments.xml.aop.aspectj.biz.MoocIntroduction;
import com.rc.rudiments.xml.aop.aspectj.biz.MoocIntroductionImpl;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName MoocAspect
 * @Description 切面类
 * @Author liux
 * @Date 19-4-24 下午12:07
 * @Version 1.0
 */
@Component
@Aspect
public class MoocAspect {

    @Pointcut("execution(* com.rc.rudiments.xml.aop.aspectj.biz.*Biz.*(..))")
    public void pointcut() {}

    @Pointcut("within(com.rc.rudiments.xml.aop.aspectj.biz.*)")
    public void bizPointcut() {}

    @Before("pointcut()")
    public void before() {
        System.out.println("Before.");
    }

    @Before("pointcut() && args(arg)")
    public void beforeWithParam(String arg) {
        System.out.println("BeforeWithParam." + arg);
    }

    @Before("pointcut() && @annotation(moocMethod)")
    public void beforeWithAnnotaion(MoocMethod moocMethod) {
        System.out.println("BeforeWithAnnotation." + moocMethod.value());
    }

    @AfterReturning(pointcut="bizPointcut()", returning="returnValue")
    public void afterReturning(Object returnValue) {
        System.out.println("AfterReturning : " + returnValue);
    }

    @AfterThrowing(pointcut="pointcut()", throwing="e")
    public void afterThrowing(RuntimeException e) {
        System.out.println("AfterThrowing : " + e.getMessage());
    }

    @After("pointcut()")
    public void after() {
        System.out.println("After.");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around 1.");
        Object obj = pjp.proceed();
        System.out.println("Around 2.");
        System.out.println("Around : " + obj);
        return obj;
    }

    @DeclareParents(value="com.rc.rudiments.xml.aop.aspectj.biz.MoocBiz",defaultImpl = MoocIntroductionImpl.class)
    public static MoocIntroduction moocIntroduction;

    @Before(value = "pointcut() && this(moocIntroduction)", argNames = "moocIntroduction")
    public void introductionMethod(MoocIntroduction moocIntroduction) {
        moocIntroduction.hello("aa");
    }
}
