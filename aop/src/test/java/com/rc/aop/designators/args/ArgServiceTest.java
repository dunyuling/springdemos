package com.rc.aop.designators.args;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName ArgServiceTest
 * @Description com.rc.aop.designators--匹配参数--测试类
 * @Author liux
 * @Date 19-4-16 下午6:23
 * @Version 1.0
 */
@ContextConfiguration(locations = {"classpath:spring-aop.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ArgServiceTest {

    @Autowired
    ArgService argService;

    @Test
    public void test() {
        argService.findById(1L);
        argService.findByIdAndName(1L, "test");
    }
}
