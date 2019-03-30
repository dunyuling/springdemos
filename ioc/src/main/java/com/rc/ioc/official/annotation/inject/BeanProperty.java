package com.rc.ioc.official.annotation.inject;

import com.rc.ioc.official.annotation.AnotherBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @ClassName BeanProperty
 * @Description 通过属性注入
 * @Author liux
 * @Date 19-3-30 下午7:29
 * @Version 1.0
 */
@Component
public class BeanProperty {

    @Autowired
    private AnotherBean anotherBean;

    @Override
    public String toString() {
        return "BeanProperty{" +
                "anotherBean=" + anotherBean +
                '}';
    }
}
