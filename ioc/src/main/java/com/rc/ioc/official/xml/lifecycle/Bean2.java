package com.rc.ioc.official.xml.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @ClassName Bean
 * @Description 测试Bean的生命周期-实现接口
 * @Author liux
 * @Date 19-3-30 上午11:53
 * @Version 1.0
 */
public class Bean2 implements InitializingBean , DisposableBean {


    @Override
    public void destroy() throws Exception {
        System.out.println("Bean2 destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean2 afterPropertiesSet");
    }
}
