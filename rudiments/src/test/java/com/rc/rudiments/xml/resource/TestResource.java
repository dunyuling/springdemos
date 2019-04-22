package com.rc.rudiments.xml.resource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName TestResource
 * @Description MoocResource 测试类
 * @Author liux
 * @Date 19-4-21 下午11:25
 * @Version 1.0
 */
public class TestResource /*extends UnitTestBase */{

    public TestResource() {
//        super("classpath:spring-resource.xml");
    }

    @Test
    public void test() throws IOException {
        /*MoocResource moocResource = super.getBean("moocResource", MoocResource.class);
        moocResource.resource();*/

        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("file:/home/liux/IdeaProjects/springdemos/rudiments/src/main/resources/spring-resource.xml");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-resource.xml");
        MoocResource moocResource = applicationContext.getBean("moocResource", MoocResource.class);
        moocResource.resource();

    }

}
