package com.rc.ioc.official.annotation.inject;

import com.rc.ioc.official.annotation.AnotherBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName BeanSet
 * @Description 通过Set方法注入
 * @Author liux
 * @Date 19-3-30 下午7:20
 * @Version 1.0
 */
@Component
public class BeanSet {

    private AnotherBean anotherBean;

    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    @Autowired
    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    @Override
    public String toString() {
        return "BeanSet{" +
                "anotherBean=" + anotherBean +
                '}';
    }
}
