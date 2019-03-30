package com.rc.ioc.official.annotation.inject;

import com.rc.ioc.official.annotation.AnotherBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/*
 * @ClassName TestBean
 * @Description 通过注解注入Bean的测试
 * @Author liux
 * @Date 19-3-30 下午7:12
 * @Version 1.0
 */
public class TestBean {

    private ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);

    /*
     * @Author liux
     * @Description 通过构造方法进行注入的测试
     * @Date 19-3-30 下午7:13
     * @param
     * @return
     **/
    @Test
    public void testConstruct() {
        BeanConstruct beanConstruct = applicationContext.getBean("beanConstruct", BeanConstruct.class);
        System.out.println("beanConstruct = " + beanConstruct);
    }

    /*
     * @Author liux
     * @Description 通过set方法进行注入的测试
     * @Date 19-3-30 下午7:23
     * @param
     * @return void
     **/
    @Test
    public void testSet() {
        BeanSet beanSet = applicationContext.getBean("beanSet", BeanSet.class);
        System.out.println("beanSet = " + beanSet);
    }

    /*
     * @Author liux
     * @Description 通过属性进行注入的测试
     * @Date 19-3-30 下午7:30
     * @param
     * @return void
     **/
    @Test
    public void testProperty() {
        BeanProperty beanProperty = applicationContext.getBean("beanProperty", BeanProperty.class);
        System.out.println("beanProperty = " + beanProperty);
    }

    /*
     * @Author liux
     * @Description 测试集合类型的注入
     * @Date 19-3-30 下午7:36
     * @param
     * @return void
     **/
    //TODO 注意结合代码看结果，此处变化较多
    @Test
    public void testCollection() {
        BeanCollection beanCollection = applicationContext.getBean("beanCollection", BeanCollection.class);
        System.out.println("beanCollection = " + beanCollection);
        System.out.println("stringList: ");
        for (String s : beanCollection.getStringList()) {
            System.out.println("s = " + s);
        }

        System.out.println();
        System.out.println("integerList: ");
        for (Integer i : beanCollection.getIntegerList()) {
            System.out.println("i = " + i);
        }

        System.out.println();
        System.out.println("integerMap: ");
        Map<String,Integer> integerMap = beanCollection.getIntegerMap();
        for (String key : integerMap.keySet()) {
            System.out.println(key + " : " + integerMap.get(key));
        }

        System.out.println();
        System.out.println("map: ");
        Map<Integer,Integer> map = beanCollection.getMap();
        for (Integer i : map.keySet()) {
            System.out.println(i + " ： " + map.get(i));
        }
    }

    /*
     * @Author liux
     * @Description 测试String,Integer等简单类型的注入
     * @Date 19-3-30 下午8:16
     * @param 
     * @return void
     **/
    @Test
    public void testSimpleType() {
        BeanSimpleType beanSimpleType = applicationContext.getBean("beanSimpleType",BeanSimpleType.class);
        System.out.println("beanSimpleType = " + beanSimpleType);
    }

    /*
     * @Author liux
     * @Description 测试SpringIoC容器内置接口实例注入
     * @Date 19-3-30 下午8:22
     * @param
     * @return void
     **/
    @Test
    public void testSpringInner() {
        BeanSpringInner beanSpringInner = applicationContext.getBean("beanSpringInner",BeanSpringInner.class);
        AnotherBean anotherBean = beanSpringInner.getApplicationContext().getBean("anotherBean", AnotherBean.class);
        System.out.println("anotherBean = " + anotherBean);
    }
}
