package com.rc.rudiments.xml.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.NonNull;

/**
 * @ClassName MoocBeanName
 * @Description MoocBeanName类
 * @Author liux
 * @Date 19-4-21 下午7:14
 * @Version 1.0
 */
public class MoocBeanName implements BeanNameAware, ApplicationContextAware {

    private String beanName;


    @Override
    public void setBeanName(@NonNull String name) {
        this.beanName = name;
        System.out.println("MoocBeanName: " + name);
    }

    @Override
    public void setApplicationContext(@NonNull ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext: "
                + applicationContext.getBean(this.beanName).hashCode());
    }
}
