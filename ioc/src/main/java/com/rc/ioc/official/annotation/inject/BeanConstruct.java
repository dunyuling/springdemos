package com.rc.ioc.official.annotation.inject;

import com.rc.ioc.official.annotation.AnotherBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName BeanConst
 * @Description 通过构造方法注入
 * @Author liux
 * @Date 19-3-30 下午7:03
 * @Version 1.0
 */
@Component
public class BeanConstruct {

    private AnotherBean anotherBean;

    //可以注释掉@Autowired
//    @Autowired
    public BeanConstruct(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    @Override
    public String toString() {
        return "BeanConstruct{" +
                "anotherBean=" + anotherBean +
                '}';
    }
}
