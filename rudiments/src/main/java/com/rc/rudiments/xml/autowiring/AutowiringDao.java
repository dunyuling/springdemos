package com.rc.rudiments.xml.autowiring;

import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName AutowiringDao
 * @Description 自动装配--AutowiringDao类
 * @Author liux
 * @Date 19-4-21 下午10:49
 * @Version 1.0
 */
@ComponentScan()
public class AutowiringDao {

    public void say(String word) {
        System.out.println("AutoWiringDAO : " + word);
    }
}