package com.rc.rudiments.xml.ioc.interfaces;

/**
 * @ClassName Main
 * @Description Main类
 * @Author liux
 * @Date 19-4-21 上午11:01
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        OneInterface oneInterface = new OneInterfaceImpl();
        System.out.println(oneInterface.hello("word"));
    }
}
