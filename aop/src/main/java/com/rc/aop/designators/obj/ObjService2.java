package com.rc.aop.designators.obj;

import org.springframework.stereotype.Service;

/**
 * @ClassName ObjService2
 * @Description com.rc.aop.designators--匹配对象--方法类(实现IObjService接口)
 * @Author liux
 * @Date 19-4-16 下午5:56
 * @Version 1.0
 */
@Service
public class ObjService2 implements IObjService {

    public void m1() {
        System.out.println(this.getClass().getName() + ": m1()");
    }

    public void m2() {
        System.out.println(this.getClass().getName() + ": m2()");
    }
}
