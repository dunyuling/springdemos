package com.rc.aop.designators.execution;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName ExecutionServiceTest
 * @Description com.rc.aop.designators--匹配参数--测试类
 * @Author liux
 * @Date 19-4-17 下午12:45
 * @Version 1.0
 */
@ContextConfiguration(locations = {"classpath:spring-aop.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ExecutionServiceTest {

    @Autowired
    ExecutionService executionService;

    @Test
    public void test() {
        executionService.m1();
        try {
            executionService.m2("kotlin");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
