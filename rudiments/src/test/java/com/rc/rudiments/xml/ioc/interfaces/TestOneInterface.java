package com.rc.rudiments.xml.ioc.interfaces;

import com.rc.rudiments.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * @ClassName TestOneInterface
 * @Description TestOneInterface测试类
 * @Author liux
 * @Date 19-4-21 上午11:04
 * @Version 1.0
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {

    public TestOneInterface() {
        super("classpath:spring-ioc.xml");
    }

    @Test
    public void testHello() {
        OneInterface oneInterface = super.getBean(OneInterface.class);
        System.out.println(oneInterface.hello("word"));
    }
}