package com.rc.aop.pattern.cglib;

/**
 * @ClassName CglibRealSubject
 * @Description cglib动态代理目标实现类
 * @Author liux
 * @Date 19-4-17 下午5:37
 * @Version 1.0
 */
public class CglibRealSubject extends CglibSubject {
    @Override
    void request() {
        System.out.println(this.getClass().getName() + " request() ");
    }

    @Override
    void hello() {
        System.out.println(this.getClass().getName() + " hello() ");
    }
}
