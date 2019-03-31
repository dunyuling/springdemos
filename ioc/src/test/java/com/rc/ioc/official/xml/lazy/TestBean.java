package com.rc.ioc.official.xml.lazy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * @ClassName TestBean
 * @Description 测试懒加载
 * @Author liux
 * @Date 19-3-30 上午11:19
 * @Version 1.0
 */
public class TestBean {

    private ApplicationContext applicationContext;

    /*
     * @Author liux
     * @Description Bean 默认不是懒加载
     * @Date 19-3-30 上午11:22
     * @param 
     * @return void
     **/
    @Test
    public void testNotLazy() {
        applicationContext = new ClassPathXmlApplicationContext("lazy/spring-not-lazy.xml");
        System.out.println("applicationContext 被创建");
        Bean bean = applicationContext.getBean("notLazyBean",Bean.class);
        System.out.println("Bean = " + bean);
    }

    /*
     * @Author liux
     * @Description 测试Bean的懒加载
     * @Date 19-3-30 上午11:22
     * @param
     * @return void
     **/
    @Test
    public void testLazy() {
        applicationContext = new ClassPathXmlApplicationContext("lazy/spring-lazy.xml");
        System.out.println("applicationContext 被创建");
        Bean bean = applicationContext.getBean("lazyBean",Bean.class);
        System.out.println("Bean = " + bean);
    }
}
