package com.rc.rudiments.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * @ClassName UnitTestBase
 * @Description 单元测试基类
 * @Author liux
 * @Date 19-4-21 上午11:15
 * @Version 1.0
 */
public class UnitTestBase {

    private ClassPathXmlApplicationContext context;

    private String springXmlPath;

    public UnitTestBase() {
    }

    public UnitTestBase(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }

    @Before
    public void before() {
        if (StringUtils.isEmpty(springXmlPath)) {
            springXmlPath = "classpath*:spring-*.xml";
        }

        try {

            context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
            context.start();
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }

    @After
    public void after() {
        context.close();
    }

    @SuppressWarnings("unchecked")
    protected <T> T getBean(String beanId) {
        return (T) context.getBean(beanId);
    }

    protected <T> T getBean(Class<T> clazz) {
        return context.getBean(clazz);
    }

    protected <T> T getBean(String beanId, Class<T> clazz) {
        return context.getBean(beanId, clazz);
    }
}
