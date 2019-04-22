package com.rc.rudiments.xml.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.NonNull;

/**
 * @ClassName MoocApplicationContext
 * @Description MoocApplicationContext类
 * @Author liux
 * @Date 19-4-21 下午7:11
 * @Version 1.0
 */
public class MoocApplicationContext implements ApplicationContextAware {

    @Override
    public void setApplicationContext(@NonNull ApplicationContext applicationContext) throws BeansException {
        System.out.println("MoocApplicationContext : " +
                applicationContext.getBean("moocApplicationContext").hashCode());

        //关闭会引发NPE
        //((ClassPathXmlApplicationContext)applicationContext).close();
    }
}