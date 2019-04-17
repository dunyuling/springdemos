package com.rc.aop.mock;

import com.rc.aop.mock.security.CurrentUserHolder;
import com.rc.aop.mock.service.AuthService;
import com.rc.aop.mock.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName ProductTest
 * @Description 认证测试类
 * @Author liux
 * @Date 19-4-16 下午12:06
 * @Version 1.0
 */
@ContextConfiguration(locations = {"classpath:spring-aop.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ProductTest {

    @Autowired
    ProductService productService;

    @Autowired
    AuthService authService;

    @Test(expected = Exception.class)
    public void testInsert() {
        productService.insert(null);
    }

    @Test
    public void testDelete() {
        CurrentUserHolder.set("ll");
        productService.delete(null);
    }
}
