package com.rc.rudiments.xml.aop.schema.advisor;

import com.rc.rudiments.base.UnitTestBase;
import com.rc.rudiments.xml.aop.schema.advisor.service.InvokeService;
import org.junit.Test;

/**
 * @ClassName TestAdvisor
 * @Description Advisor测试类
 * @Author liux
 * @Date 19-4-23 下午6:09
 * @Version 1.0
 */
public class TestAdvisor extends UnitTestBase {

    public TestAdvisor() {
        super("classpath:spring-aop-schema-advisors.xml");
    }

    @Test
    public void testService() {
        InvokeService invokeService = super.getBean("invokeService",InvokeService.class);
        invokeService.invoke();
        System.out.println("------------");
        invokeService.invokeException();
    }
}
