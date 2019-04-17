package com.rc.aop.designators.obj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName ObjServicesTest
 * @Description com.rc.aop.designators--匹配对象--测试类
 * @Author liux
 * @Date 19-4-16 下午6:04
 * @Version 1.0
 */
@ContextConfiguration(locations = {"classpath:spring-aop.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ObjServicesTest {

    @Autowired
    ObjService objService;

    @Autowired
    ObjService2 objService2;

    @Test
    public void test() {
        objService.m1();
        objService.m2();
        objService2.m1();
        objService2.m2();
    }
}