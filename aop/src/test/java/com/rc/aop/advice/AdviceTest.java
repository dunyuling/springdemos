package com.rc.aop.advice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName AdviceTest
 * @Description 5种advice的用法--切面类测试类
 * @Author liux
 * @Date 19-4-17 下午1:57
 * @Version 1.0
 */
@ContextConfiguration(locations = {"classpath:spring-aop.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AdviceTest {

    @Autowired
    AdviceService adviceService;

    @Test
    public void before() {
        adviceService.before(1L);
    }

    @Test
    public void after() {
        adviceService.after();
    }

    @Test
    public void afterReturning() {
        adviceService.afterReturning();
    }

    @Test
    public void afterThrowing() {
        adviceService.afterThrowing();
    }

    @Test
    public void around() {
        adviceService.around("ll");
    }
}
