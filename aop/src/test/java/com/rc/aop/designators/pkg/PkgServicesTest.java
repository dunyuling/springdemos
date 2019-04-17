package com.rc.aop.designators.pkg;

import com.rc.aop.designators.pkg.sub.PkgSubService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName PkgServicesTest
 * @Description com.rc.aop.designators--匹配包/类型--测试类
 * @Author liux
 * @Date 19-4-16 下午5:45
 * @Version 1.0
 */
@ContextConfiguration(locations = {"classpath:spring-aop.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class PkgServicesTest {

    @Autowired
    PkgService pkgService;

    @Autowired
    PkgSubService pkgSubService;

    @Test
    public void test() {
        pkgService.m1();
        pkgService.m2();

        pkgSubService.m1();
    }
}
