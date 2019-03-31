package com.rc.ioc.official.annotation.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName TestBean
 * @Description Bean作用域测试
 * @Author liux
 * @Date 19-3-31 下午12:05
 * @Version 1.0
 */
public class TestBean {

    private ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);

    /*
     * @Author liux
     * @Description singleton作用域，只能保证同一个上下文环境的单例
     * @Date 19-3-31 下午12:11
     * @param
     * @return void
     **/
    @Test
    public void testSingleton() {
        for (int i = 0; i < 10; i++) {
            SingletonBean singletonBean1 = applicationContext.getBean("singletonBean1", SingletonBean.class);
            System.out.println("singletonBean1 = " + singletonBean1);
        }


        System.out.println("-----------");
        for (int i = 10; i > 0; i--) {
            SingletonBean singletonBean2 = applicationContext.getBean("singletonBean2", SingletonBean.class);
            System.out.println("singletonBean2 = " + singletonBean2);
        }
    }

    /*
     * @Author liux
     * @Description prototype作用域
     * @Date 19-3-31 下午12:13
     * @param
     * @return void
     **/
    @Test
    public void testPrototype() {
        for (int i = 0; i < 10; i++) {
            PrototypeBean prototypeBean1 = applicationContext.getBean("prototypeBean1", PrototypeBean.class);
            System.out.println("prototypeBean1 = " + prototypeBean1);
        }


        System.out.println("-----------");
        for (int i = 10; i > 0; i--) {
            PrototypeBean prototypeBean2 = applicationContext.getBean("prototypeBean2", PrototypeBean.class);
            System.out.println("prototypeBean2 = " + prototypeBean2);
        }
    }

    /*
     * @Author liux
     * @Description bean依赖anotherBean,bean为singleton,anotherBean为prototype时，
     *              让anotherBean每次产生新的实例的测试
     * @Date 19-3-31 下午12:22
     * @param
     * @return void
     **/
    @Test
    public void testMethodPrototype() {
        MethodPrototypeBean methodPrototypeBean = applicationContext.getBean("methodPrototypeBean", MethodPrototypeBean.class);
        methodPrototypeBean.printSecondBean();
        methodPrototypeBean.printSecondBean();
    }

    /*
     * @Author liux
     * @Description 测试自定义作用域
     * @Date 19-3-31 下午1:08
     * @param
     * @return void
     **/
    @Test
    public void testMyScope() {
        for (int i = 0; i < 10; i++) {
            MyScopeBean myScopeBean = applicationContext.getBean("myScopeBean",MyScopeBean.class);
            System.out.println("myScopeBean = " + myScopeBean);
        }
    }

    /*
     * @Author liux
     * @Description 测试SimpleThreadScope作用域，每个线程实例化新的对象
     * @Date 19-3-31 下午1:17
     * @param null
     * @return
     **/
    @Test
    public void testSimpleThreadScope() {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                MyScopeBean myScopeBean2 = applicationContext.getBean("myScopeBean2",MyScopeBean.class);
                System.out.println("myScopeBean2 = " + myScopeBean2);
            }).start();
        }
    }
}
