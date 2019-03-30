package com.rc.ioc.official.annotation.inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName BeanSimpleType
 * @Description String,Integer等简单类型的注入
 * @Author liux
 * @Date 19-3-30 下午8:08
 * @Version 1.0
 */
@Component
public class BeanSimpleType {

    private String str;

    private int i;

    public String getStr() {
        return str;
    }

    @Value("simpletype")
    public void setStr(String str) {
        this.str = str;
    }

    public int getI() {
        return i;
    }

    @Value("777")
    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "BeanSimpleType{" +
                "str='" + str + '\'' +
                ", i=" + i +
                '}';
    }
}
