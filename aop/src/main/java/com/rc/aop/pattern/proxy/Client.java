package com.rc.aop.pattern.proxy;

/**
 * @ClassName Client
 * @Description 客户端类
 * @Author liux
 * @Date 19-4-17 下午4:20
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new ProxySubject(new RealSubject());
        subject.request();
    }
}
