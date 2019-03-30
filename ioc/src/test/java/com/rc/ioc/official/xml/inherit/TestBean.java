package com.rc.ioc.official.xml.inherit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestBean
 * @Description 测试Bean的属性继承
 * @Author liux
 * @Date 19-3-30 下午12:56
 * @Version 1.0
 */
public class TestBean {

    private ApplicationContext applicationContext;

    /*
     * @Author liux
     * @Description 子类继承父类
     * @Date 19-3-30 下午12:57
     * @param 
     * @return void
     **/
    @Test
    public void testActualParent() {
        applicationContext = new ClassPathXmlApplicationContext("inherit/spring-inherit-1.xml");
        Class1 class1 =  applicationContext.getBean("class1",Class1.class);
        System.out.println("Class1 = " + class1);
        Class2 class2 =  applicationContext.getBean("class2",Class2.class);
        System.out.println("Class2 = " + class2);
    }

    /*
     * @Author liux
     * @Description 不继承某个父类，只是拥有某些共同属性
     * @Date 19-3-30 下午1:02
     * @param 
     * @return void
     **/
    @Test
    public void testAbstractParent() {
        applicationContext = new ClassPathXmlApplicationContext("inherit/spring-inherit-2.xml");
        Class3 class3 =  applicationContext.getBean("class3",Class3.class);
        System.out.println("Class3 = " + class3);
        Class4 class4 =  applicationContext.getBean("class4",Class4.class);
        System.out.println("Class4 = " + class4);
    }
}
