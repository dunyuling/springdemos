package com.rc.aop.designators.annotation.sub;

import com.rc.aop.designators.annotation.AnnotationService;
import com.rc.aop.designators.annotation.NeedSecured;
import com.rc.aop.designators.annotation.NeedSecuredArgClass;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @ClassName SubAnnotationService
 * @Description com.rc.aop.designators--匹配注解--子类--方法类
 * @Author liux
 * @Date 19-4-17 下午12:06
 * @Version 1.0
 */
@Service
public class SubAnnotationService extends AnnotationService {

    @Override
    public void m1() {
        System.out.println(this.getClass().getName() + ": SubAnnotationService m1()");
    }

    @Override
    public void m2() {
        System.out.println(this.getClass().getName() + " : m2()");
    }

    @Override
    public void m3(NeedSecuredArgClass needSecuredArgClass) {
        System.out.println(this.getClass().getName() + " : m3(NeedSecuredArgClass needSecuredArgClass)");
    }
}