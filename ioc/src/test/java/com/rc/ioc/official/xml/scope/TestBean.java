package com.rc.ioc.official.xml.scope;

import com.rc.ioc.official.xml.AnotherBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * @ClassName TestBean
 * @Description Bean作用域测试
 * @Author liux
 * @Date 19-3-29 下午4:17
 * @Version 1.0
 */
public class TestBean {

    private ApplicationContext applicationContext;

    /*
     * @Author liux
     * @Description singleton作用域，只能保证同一个上下文环境的单例
     * @Date 19-3-29 下午4:27
     * @param 
     * @return void
     **/
    @Test
    public void testSingleton() {
        applicationContext = new ClassPathXmlApplicationContext("scope/spring-singleton.xml");
        AnotherBean anotherBean1 = applicationContext.getBean("anotherBean", AnotherBean.class);
        AnotherBean anotherBean2 = applicationContext.getBean("anotherBean", AnotherBean.class);
        System.out.println(anotherBean1);
        System.out.println(anotherBean2);
        Bean bean = applicationContext.getBean("bean", Bean.class);
        System.out.println(bean);

        System.out.println();
        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("scope/spring-singleton.xml");
        AnotherBean anotherBean3 = applicationContext2.getBean("anotherBean", AnotherBean.class);
        AnotherBean anotherBean4 = applicationContext2.getBean("anotherBean", AnotherBean.class);
        System.out.println(anotherBean3);
        System.out.println(anotherBean4);
        Bean bean2 = applicationContext2.getBean("bean", Bean.class);
        System.out.println(bean2);
    }

    /*
     * @Author liux
     * @Description prototype作用域
     * @Date 19-3-29 下午4:26
     * @param 
     * @return void
     **/
    @Test
    public void testPrototype() {
        applicationContext = new ClassPathXmlApplicationContext("scope/spring-prototype.xml");
        AnotherBean anotherBean1 = applicationContext.getBean("anotherBean", AnotherBean.class);
        AnotherBean anotherBean2 = applicationContext.getBean("anotherBean", AnotherBean.class);
        System.out.println(anotherBean1);
        System.out.println(anotherBean2);
        Bean bean = applicationContext.getBean("bean", Bean.class);
        System.out.println(bean);
    }

    /*
     * @Author liux
     * @Description bean依赖anotherBean,bean为singleton,anotherBean为prototype时，
     *              让anotherBean每次产生新的实例的测试
     * @Date 19-3-29 下午5:31
     * @param 
     * @return void
     **/
    @Test
    public void testMethodPrototype() {
        applicationContext = new ClassPathXmlApplicationContext("scope/spring-method-prototype.xml");
        MethodPrototypeBean methodPrototypeBean = applicationContext.getBean("methodPrototypeBean",MethodPrototypeBean.class);
        methodPrototypeBean.printAnotherBean();
        methodPrototypeBean.printAnotherBean();
    }

    /*
     * @Author liux
     * @Description 测试自定义作用域
     * @Date 19-3-29 下午7:42
     * @param 
     * @return void
     **/
    @Test
    public void testMyScope() {
        applicationContext = new ClassPathXmlApplicationContext("scope/spring-my-scope.xml");
        for (int i = 10; i > 0; i--) {
            Bean bean = applicationContext.getBean("bean",Bean.class);
            System.out.println(bean.hashCode());
        }
    }

    /*
     * @Author liux
     * @Description 测试SimpleThreadScope作用域，每个线程实例化新的对象
     * @Date 19-3-29 下午10:00
     * @param 
     * @return void
     **/
    @Test
    public void testSimpleThreadScope() {
        applicationContext = new ClassPathXmlApplicationContext("scope/spring-simple-thread-scope.xml");

        for (int i = 10; i > 0; i--) {
            new Thread(() -> {
                Bean bean = applicationContext.getBean("bean",Bean.class);
                System.out.println(bean.hashCode());
            }).start();
        }
    }
}
