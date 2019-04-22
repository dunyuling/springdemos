package com.rc.rudiments.xml.autowiring;

import com.rc.rudiments.base.UnitTestBase;
import org.junit.Test;

/**
 * @ClassName TestAutowiring
 * @Description autowiring测试类
 * @Author liux
 * @Date 19-4-21 下午10:55
 * @Version 1.0
 */
public class TestAutowiring extends UnitTestBase {

    public TestAutowiring() {
        super("classpath:spring-autowiring.xml");
    }

    /*
     * @Author liux
     * @Description autowire--byName
     * @Date 19-4-21 下午11:05
     * @param 
     * @return void
     **/
    @Test
    public void testAutowireByName() {
        AutowiringService autowiringService = super.getBean("autowiringService",AutowiringService.class);
        autowiringService.say("testAutowireByName");
    }

    /*
     * @Author liux
     * @Description autowire--byName
     * @Date 19-4-21 下午11:06
     * @param 
     * @return void
     **/
    @Test
    public void testAutowireByType() {
        AutowiringService autowiringService = super.getBean("autowiringService",AutowiringService.class);
        autowiringService.say("testAutowireByType");
    }

    /*
     * @Author liux
     * @Description autowire--byConstruct
     * @Date 19-4-21 下午11:14
     * @param 
     * @return void
     **/
    @Test
    public void testAutowireByConstruct() {
        AutowiringService autowiringService = super.getBean("autowiringService",AutowiringService.class);
        autowiringService.say("testAutowireByConstruct");
    }
}
