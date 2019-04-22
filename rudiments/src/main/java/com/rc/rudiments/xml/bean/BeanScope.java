package com.rc.rudiments.xml.bean;

/**
 * @ClassName BeanScope
 * @Description BeanScope--Bean作用域
 * @Author liux
 * @Date 19-4-21 下午6:14
 * @Version 1.0
 */
public class BeanScope {

    public void say() {
        System.out.println("BeanScope say : " + this.hashCode());
    }
}
