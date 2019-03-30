package com.rc.ioc.official.annotation.inject;

import com.rc.ioc.official.annotation.AnotherBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @ClassName BeanSpringInner
 * @Description SpringIoC容器内置接口实例注入
 * @Author liux
 * @Date 19-3-30 下午8:21
 * @Version 1.0
 */
@Component
public class BeanSpringInner {

    @Autowired
    private AnotherBean anotherBean;

    private ApplicationContext applicationContext;

    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
}
