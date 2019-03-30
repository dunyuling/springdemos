package com.rc.ioc.official.xml.lifecycle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestBean
 * @Description 测试Bean的生命周期
 * @Author liux
 * @Date 19-3-30 上午11:57
 * @Version 1.0
 */
public class TestBean {

    private AbstractApplicationContext abstractApplicationContext;

    /*
     * @Author liux
     * @Description 测试Bean的生命周期过程,通过方法
     * @Date 19-3-30 上午11:58
     * @param 
     * @return void
     **/
    @Test
    public void testLifeCycleMethod() {
        abstractApplicationContext = new ClassPathXmlApplicationContext("lifecycle/spring-method.xml");
        Bean bean = abstractApplicationContext.getBean("lifecycleMethodBean",Bean.class);
        System.out.println("Bean = " + bean);
        //只有主动关闭才能看到onDestroy方法的执行
        abstractApplicationContext.close();
    }

    /*
     * @Author liux
     * @Description 测试Bean的生命周期过程,通过接口
     * @Date 19-3-30 下午12:19
     * @param 
     * @return void
     **/
    @Test
    public void testLifeCycleInterface() {
        abstractApplicationContext = new ClassPathXmlApplicationContext("lifecycle/spring-interface.xml");
        Bean2 bean2 = abstractApplicationContext.getBean("beanLifeCycleInterface", Bean2.class);
        abstractApplicationContext.close();
        System.out.println("Bean2 = " + bean2);
    }
}
