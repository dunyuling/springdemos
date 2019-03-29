package com.rc.ioc.official.xml.instance;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * @ClassName TestBean
 * @Description 实例化方式测试
 * @Author liux
 * @Date 19-3-29 下午12:06
 * @Version 1.0
 */
public class TestBean {

    private ApplicationContext applicationContext;

    @Before
    public void before() {
        applicationContext = new ClassPathXmlApplicationContext("spring-instance.xml");
    }

    /*
     * @param
     * @return void
     * @Author liux
     * @Description 通过构造方法实例化Bean
     * @Date 19-3-29 下午2:47
     **/
    @Test
    public void testConstructor() {
        Bean1 bean1 = applicationContext.getBean("bean1", Bean1.class);
        System.out.println("bean1 = " + bean1);
    }

    /*
     * @param
     * @return void
     * @Author 通过静态方法实例化Bean
     * @Description TODO
     * @Date 19-3-29 下午2:48
     **/
    @Test
    public void testStatic() {
        Bean2 bean2 = applicationContext.getBean("bean2", Bean2.class);
        System.out.println("bean2 = " + bean2);
    }

    /*
     * @param
     * @return
     * @Author liux
     * @Description 通过实例方法实例化Bean
     * @Date 19-3-29 下午2:49
     **/
    @Test
    public void testObject() {
        Bean3 bean3 = applicationContext.getBean("bean3", Bean3.class);
        System.out.println("bean3 = " + bean3);
    }

    /*
     * @Author liux
     * @Description bean的别名
     * @Date 19-3-29 下午2:50
     * @param
     * @return void
     **/
    @Test
    public void testAlias() {
        Bean1 bean1_1 = applicationContext.getBean("bean1_1", Bean1.class);
        System.out.println("bean1_1 = " + bean1_1);

        Bean1 bean1_2 = applicationContext.getBean("bean1_2", Bean1.class);
        System.out.println("bean1_2 = " + bean1_2);

        Bean1 bean1_3 = applicationContext.getBean("bean1_3", Bean1.class);
        System.out.println("bean1_3 = " + bean1_3);
    }
}
