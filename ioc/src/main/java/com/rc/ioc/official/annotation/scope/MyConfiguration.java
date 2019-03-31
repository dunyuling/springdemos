package com.rc.ioc.official.annotation.scope;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.SimpleThreadScope;

/**
 * @ClassName MyConfiguration
 * @Description Bean的注解方式的作用域
 * @Author liux
 * @Date 19-3-31 下午12:03
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.rc.ioc.official.annotation.scope")
public class MyConfiguration {


    @Bean("singletonBean2")
    public SingletonBean BeanSingleton() {
        return new SingletonBean();
    }

    @Bean("prototypeBean2")
    @Scope("prototype")
    public PrototypeBean beanPrototype() {
        return new PrototypeBean();
    }

    @Bean
    @Scope("myScope")
    public MyScopeBean myScopeBean() {
        return new MyScopeBean();
    }

    @Bean
    public MyScope myScope() {
        return new MyScope();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer customScopeConfigurer = new CustomScopeConfigurer();
        customScopeConfigurer.addScope("myScope", myScope());
        customScopeConfigurer.addScope("myScope2", simpleThreadScope());
        return customScopeConfigurer;
    }


    @Bean
    public SimpleThreadScope simpleThreadScope() {
        return new SimpleThreadScope();
    }

    @Bean
    @Scope("myScope2")
    public MyScopeBean myScopeBean2() {
        return new MyScopeBean();
    }

}
