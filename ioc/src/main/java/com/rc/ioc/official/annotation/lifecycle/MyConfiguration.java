package com.rc.ioc.official.annotation.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyConfiguration
 * @Description TODO
 * @Author liux
 * @Date 19-3-31 下午2:51
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.rc.ioc.official.annotation.lifecycle")
public class MyConfiguration {

    @Bean(initMethod = "onInit",destroyMethod = "onDestroy")
    public Bean1 bean1() {
        return new Bean1();
    }


    @Bean
    public Bean2 bean2() {
        return new Bean2();
    }


    @Bean
    public Bean3 bean3() {
        return new Bean3();
    }
}
