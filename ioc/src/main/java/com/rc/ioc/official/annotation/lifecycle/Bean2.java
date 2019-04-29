package com.rc.ioc.official.annotation.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @ClassName Bean1
 * @Description 生命周期中的方法
 * @Author liux
 * @Date 19-3-31 下午2:51
 * @Version 1.0
 */
public class Bean2 implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean2 destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean2 afterPropertiesSet");
    }
}
