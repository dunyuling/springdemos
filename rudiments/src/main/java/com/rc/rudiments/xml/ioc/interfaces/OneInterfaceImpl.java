package com.rc.rudiments.xml.ioc.interfaces;

/**
 * @ClassName OneInterface
 * @Description OneInterface实现类
 * @Author liux
 * @Date 19-4-20 下午11:59
 * @Version 1.0
 */
public class OneInterfaceImpl implements OneInterface {

    public String hello(String word) {
        return "Word from interface \"OneInterface\":" + word;
    }
}
