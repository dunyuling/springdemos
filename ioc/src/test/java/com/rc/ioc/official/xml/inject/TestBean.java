package com.rc.ioc.official.xml.inject;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * @ClassName TestBean
 * @Description 注入方式测试
 * @Author liux
 * @Date 19-3-29 下午2:33
 * @Version 1.0
 */
public class TestBean {


    private ApplicationContext applicationContext;

    /*
     * @Author liux
     * @Description 构造方式注入
     * @Date 19-3-29 下午2:55
     * @param
     * @return void
     **/
    @Test
    public void testConstruct() {
        applicationContext = new ClassPathXmlApplicationContext("inject/spring-inject-construct.xml");
        BeanConstruct beanConstruct = applicationContext.getBean("beanConstruct", BeanConstruct.class);
        System.out.println("beanConstruct = " + beanConstruct);
    }

    /*
     * @Author liux
     * @Description set方式注入
     * @Date 19-3-29 下午2:56
     * @param
     * @return void
     **/
    @Test
    public void testSet() {
        applicationContext = new ClassPathXmlApplicationContext("inject/spring-inject-set.xml");
        BeanSet beanSet = applicationContext.getBean("beanSet", BeanSet.class);
        System.out.println("beanSet = " + beanSet);
    }

    @Test
    public void testCollection() {
        applicationContext = new ClassPathXmlApplicationContext("inject/spring-inject-collection.xml");
        BeanCollection beanCollection = applicationContext.getBean("beanCollection", BeanCollection.class);
        System.out.println("beanCollection = " + beanCollection);
    }

    @Test
    public void testNull() {
        applicationContext = new ClassPathXmlApplicationContext("inject/spring-inject-null.xml");
        BeanNull beanNull = applicationContext.getBean("beanNull", BeanNull.class);
        System.out.println("beanNull = " + beanNull);
    }

    @Test
    public void testInnerBean() {
        applicationContext = new ClassPathXmlApplicationContext("inject/spring-inject-inner-bean.xml");
        BeanInnerBean beanInnerBean = applicationContext.getBean("beanInnerBean", BeanInnerBean.class);
        System.out.println("beanInnerBean = " + beanInnerBean);
    }
}
