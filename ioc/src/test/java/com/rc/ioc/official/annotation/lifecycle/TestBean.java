package com.rc.ioc.official.annotation.lifecycle;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName TestBean
 * @Description 生命周期的测试
 * @Author liux
 * @Date 19-3-31 下午3:01
 * @Version 1.0
 */
public class TestBean {

    private AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);

    /*
     * @Author liux
     * @Description 测试Bean的生命周期过程,通过方法
     * @Date 19-3-31 下午3:01
     * @param 
     * @return void
     **/
    @Test
    public void testLifeCycleMethod() {
        Bean1 bean1 = annotationConfigApplicationContext.getBean("bean1",Bean1.class);
        System.out.println("bean1 = " + bean1);
        //只有主动关闭才能看到onDestroy方法的执行
        annotationConfigApplicationContext.close();
    }


    /*
     * @Author liux
     * @Description 测试Bean的生命周期过程,通过接口
     * @Date 19-3-31 下午3:09
     * @param null
     * @return
     **/
    @Test
    public void testLifeCycleInterface() {
        Bean2 bean2 = annotationConfigApplicationContext.getBean("bean2",Bean2.class);
        System.out.println("bean2 = " + bean2);
        //只有主动关闭才能看到onDestroy方法的执行
        annotationConfigApplicationContext.close();
    }

    /*
     * @Author liux
     * @Description @PostConstruct,@PreDestroy方式
     * @Date 19-3-31 下午3:17
     * @param
     * @return void
     **/
    @Test
    public void test3() {
        Bean3 bean3 = annotationConfigApplicationContext.getBean("bean3",Bean3.class);
        System.out.println("bean3 = " + bean3);
        //只有主动关闭才能看到onDestroy方法的执行
        annotationConfigApplicationContext.close();
    }
}
