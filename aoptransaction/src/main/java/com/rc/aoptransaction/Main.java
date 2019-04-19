package com.rc.aoptransaction;

import com.rc.aoptransaction.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.security.auth.login.AppConfigurationEntry;

/**
 * @ClassName Main
 * @Description TODO
 * @Author liux
 * @Date 19-4-18 上午11:16
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop-transaction.xml");
        DemoService demoService = applicationContext.getBean("demoService",DemoService.class);
        System.out.println(demoService == null);
    }
}
