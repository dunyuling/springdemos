package com.rc.rudiments.annotation.javabased;

import org.springframework.stereotype.Component;

/**
 * @ClassName IntegerStore
 * @Description Integer实现类
 * @Author liux
 * @Date 19-4-22 下午6:05
 * @Version 1.0
 */
@Component
public class IntegerStore implements Store<Integer> {

    public IntegerStore() {
//        System.out.println("construct: " + this.getClass().getName() + ":" + this.hashCode());
    }
}
