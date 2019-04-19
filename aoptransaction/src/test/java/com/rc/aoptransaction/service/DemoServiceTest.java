package com.rc.aoptransaction.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName DemoServiceTest
 * @Description DemoService测试类
 * @Author liux
 * @Date 19-4-18 上午10:29
 * @Version 1.0
 */
@ContextConfiguration(locations = {"classpath:spring-aop-transaction.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class DemoServiceTest {

    @Autowired
    DemoService demoService;

    @Test(expected = DataIntegrityViolationException.class)
    public void test() {
        demoService.addUser("test");
    }
}


