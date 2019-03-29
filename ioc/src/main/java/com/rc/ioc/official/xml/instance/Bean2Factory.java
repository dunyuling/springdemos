package com.rc.ioc.official.xml.instance;

/**
 * @ClassName Bean2Factory
 * @Description 通过静态方法实例化Bean
 * @Author liux
 * @Date 19-3-29 下午12:46
 * @Version 1.0
 */
public class Bean2Factory {

    public static Bean2 getBean2() {
        return new Bean2();
    }
}
