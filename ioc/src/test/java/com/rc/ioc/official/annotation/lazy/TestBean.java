package com.rc.ioc.official.annotation.lazy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName TestBean
 * @Description 测试懒加载
 * @Author liux
 * @Date 19-3-31 下午2:27
 * @Version 1.0
 */
public class TestBean {

    private ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);


    /*
     * @Author liux
     * @Description Bean 默认不是懒加载
     * @Date 19-3-31 下午2:27
     * @param 
     * @return void
     **/
    @Test
    public void testNotLazy() {
        System.out.println("applicationContext 被创建");
        NotLazyBean notLazyBean = applicationContext.getBean("notLazyBean",NotLazyBean.class);
        System.out.println("notLazyBean = " + notLazyBean);
    }

    /*
     * @Author liux
     * @Description 测试Bean的懒加载
     * @Date 19-3-31 下午2:28
     * @param null
     * @return
     **/
    @Test
    public void testLazy() {
        System.out.println("applicationContext 被创建");
        LazyBean lazyBean = applicationContext.getBean("lazyBean",LazyBean.class);
        System.out.println("lazyBean = " + lazyBean);
    }
}
