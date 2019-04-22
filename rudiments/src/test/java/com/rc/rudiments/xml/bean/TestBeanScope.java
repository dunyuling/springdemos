package com.rc.rudiments.xml.bean;

import com.rc.rudiments.base.UnitTestBase;
import org.junit.Test;

/**
 * @ClassName TestBeanScope
 * @Description BeanScope测试类
 * @Author liux
 * @Date 19-4-21 下午6:18
 * @Version 1.0
 */
public class TestBeanScope extends UnitTestBase {

    public TestBeanScope() {
        super("classpath:spring-beanscope.xml");
    }

    /*
     * @Author liux
     * @Description singleton scope test
     * @Date 19-4-21 下午6:23
     * @param 
     * @return void
     **/
    @Test
    public void testSingleton() {
        BeanScope beanScope = super.getBean("beanScopeSingleton",BeanScope.class);
        beanScope.say();
        BeanScope beanScope2 = super.getBean("beanScopeSingleton",BeanScope.class);
        beanScope2.say();
    }

    /*
     * @Author liux
     * @Description prototype scope test
     * @Date 19-4-21 下午6:24
     * @param
     * @return void
     **/
    @Test
    public void testPrototype() {
        BeanScope beanScope = super.getBean("beanScopePrototype",BeanScope.class);
        beanScope.say();
        BeanScope beanScope2 = super.getBean("beanScopePrototype",BeanScope.class);
        beanScope2.say();
    }
}
