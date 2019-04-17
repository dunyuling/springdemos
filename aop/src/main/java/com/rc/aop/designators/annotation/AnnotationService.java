package com.rc.aop.designators.annotation;

import org.springframework.stereotype.Service;

/**
 * @ClassName AnnotationService
 * @Description com.rc.aop.designators--匹配注解--方法类
 * @Author liux
 * @Date 19-4-16 下午8:05
 * @Version 1.0
 */
@Service
@NeedSecured
public class AnnotationService {

    @AnnotationDemo
    public void m1() {
        System.out.println(this.getClass().getName() + ": AnnotationDemo m1()");
    }

    public void m2() {
        System.out.println(this.getClass().getName() + ": m2()");
    }


    public void m3(NeedSecuredArgClass needSecuredArgClass) {
        System.out.println(this.getClass().getName() + " : m3(NeedSecuredArgClass needSecuredArgClass)");
    }
}
