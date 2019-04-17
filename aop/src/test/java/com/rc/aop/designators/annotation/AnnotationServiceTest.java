package com.rc.aop.designators.annotation;

import com.rc.aop.designators.annotation.sub.SubAnnotationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName AnnotationServiceTest
 * @Description com.rc.aop.designators--匹配注解--测试类
 * @Author liux
 * @Date 19-4-16 下午8:10
 * @Version 1.0
 */
@ContextConfiguration(locations = {"classpath:spring-aop.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AnnotationServiceTest {

    @Autowired
    AnnotationService annotationService;
    @Autowired
    SubAnnotationService subAnnotationService;

    @Test
    public void test() {
        annotationService.m1();
        annotationService.m2();
        annotationService.m3(null);

        subAnnotationService.m1();
        subAnnotationService.m2();
        subAnnotationService.m3(null);
    }
}
