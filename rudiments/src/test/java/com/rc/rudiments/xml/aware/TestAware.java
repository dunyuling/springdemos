package com.rc.rudiments.xml.aware;

import com.rc.rudiments.base.UnitTestBase;
import org.junit.Test;

/**
 * @ClassName TestAware
 * @Description 实现Aware相关接口的类测试
 * @Author liux
 * @Date 19-4-21 下午7:19
 * @Version 1.0
 */
public class TestAware extends UnitTestBase {

    public TestAware() {
        super("classpath:spring-aware.xml");
    }

    @Test
    public void testMoocApplicationContext() {

        MoocApplicationContext moocApplicationContext = super.getBean("moocApplicationContext", MoocApplicationContext.class);
        System.out.println("test moocApplicationContext : " + moocApplicationContext.hashCode());
    }

    @Test
    public void testMoocBeanName() {
        System.out.println("test moocBeanName: " + super.getBean("moocBeanName", MoocBeanName.class).hashCode());
    }

}
