package com.rc.rudiments.annotation;

import com.rc.rudiments.annotation.javabased.BeanConfig;
import com.rc.rudiments.annotation.javabased.MyDriverManager;
import com.rc.rudiments.annotation.jsr.JsrService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName TestJavaBased
 * @Description javabase annotation 测试类
 * @Author liux
 * @Date 19-4-22 下午5:34
 * @Version 1.0
 */
public class TestJavaBased {

    private AnnotationConfigApplicationContext annotationConfigApplicationContext;

    @Before
    public void init() {
        annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
    }

    @Test
    public void testPrintJdbcProperties() {
        MyDriverManager myDriverManager = annotationConfigApplicationContext.getBean("myDriverManager",MyDriverManager.class);
        System.out.println(myDriverManager);
    }

    @Test
    public void testGenericAutowire() {
        BeanConfig beanConfig = annotationConfigApplicationContext.getBean("beanConfig",BeanConfig.class);
        beanConfig.printGenericAutowire();
    }

    @Test
    public void testJsr() {
        JsrService jsrService = annotationConfigApplicationContext.getBean("jsrService", JsrService.class);
        jsrService.save();
    }

    @After
    public void destroy() {
        annotationConfigApplicationContext.close();
    }
}
