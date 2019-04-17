package com.rc.aop.pattern.proxy;

/**
 * @ClassName ProxySubject
 * @Description 代理对象类
 * @Author liux
 * @Date 19-4-17 下午4:15
 * @Version 1.0
 */
public class ProxySubject implements Subject {

    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("#### proxy before");
        try {
            realSubject.request();
        } catch (Exception e) {
            System.out.println("#### ex: " + e.getMessage());
            throw e;
        } finally {
            System.out.println("#### proxy after");
        }
    }
}
