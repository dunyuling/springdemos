package com.rc.ioc.official.annotation.base;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestBean
 * @Description 测试Bean的获取
 * @Author liux
 * @Date 19-3-30 下午6:00
 * @Version 1.0
 */
public class TestBean {

    private ApplicationContext applicationContext;

    /*
     * @Author liux
     * @Description 通过注解生成Bean的实例-基本方式和别名
     * @Date 19-3-30 下午6:27
     * @param
     * @return void
     **/
    @Test
    public void testAnnotationBase() {
        applicationContext = new AnnotationConfigApplicationContext(MyConfiguration1.class);
        Bean1 bean1_1 = applicationContext.getBean("bean1_1", Bean1.class);
        System.out.println("bean1_1 = " + bean1_1);

        Bean1 bean1_2 = applicationContext.getBean("bean1_2", Bean1.class);
        System.out.println("bean1_2 = " + bean1_2);
    }

    /*
     * @Author liux
     * @Description 通过注解生成Bean的实例-component方式，通过注解方式扫描
     * @Date 19-3-30 下午6:31
     * @param
     * @return void
     **/
    @Test
    public void testAnnotationComponent() {
        applicationContext = new AnnotationConfigApplicationContext(MyConfiguration2.class);
        Bean2 bean2 = applicationContext.getBean("bean2", Bean2.class);
        System.out.println("bean2 = " + bean2);
    }

    /*
     * @Author liux
     * @Description 通过注解生成Bean的实例-component方式，通过xml方式扫描
     * @Date 19-3-30 下午6:37
     * @param
     * @return void
     **/
    @Test
    public void testAnnotationByXml() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-annotation.xml");
        Bean2 bean2 = applicationContext.getBean("bean2", Bean2.class);
        System.out.println("bean2 = " + bean2);

    }
}
