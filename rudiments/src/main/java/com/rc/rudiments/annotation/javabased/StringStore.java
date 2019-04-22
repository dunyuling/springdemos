package com.rc.rudiments.annotation.javabased;

import org.springframework.stereotype.Component;

/**
 * @ClassName StringStore
 * @Description StringStore实现类
 * @Author liux
 * @Date 19-4-22 下午6:06
 * @Version 1.0
 */
@Component
public class StringStore implements Store<String> {

    public StringStore() {
//        System.out.println("construct: " + this.getClass().getName() + ":" + this.hashCode());
    }
}
