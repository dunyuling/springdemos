package com.rc.rudiments.xml.ioc.injection;

import com.rc.rudiments.base.UnitTestBase;
import com.rc.rudiments.xml.ioc.injection.service.InjectionService;
import org.junit.Test;

/**
 * @ClassName TestInjectionService
 * @Description InjectionService测试类
 * @Author liux
 * @Date 19-4-21 下午5:09
 * @Version 1.0
 */
public class TestInjectionService extends UnitTestBase {

    public TestInjectionService() {
        super("classpath:spring-injection.xml");
    }

    /*
     * @Author liux
     * @Description set方式注入
     * @Date 19-4-21 下午5:16
     * @param 
     * @return void
     **/
    @Test
    public void testSetter() {
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("testSetter");
    }

    /*
     * @Author liux
     * @Description 构造方式注入
     * @Date 19-4-21 下午5:16
     * @param
     * @return void
     **/
    @Test
    public void testConstructor() {
        InjectionService injectionService = super.getBean(InjectionService.class);
        injectionService.save("testConstructor");
    }
}
