package com.rc.ioc.official.annotation.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyConfiguration
 * @Description 通过注解生成Bean的实例-基本方式
 * @Author liux
 * @Date 19-3-30 下午5:58
 * @Version 1.0
 */
@Configuration
public class MyConfiguration1 {

    @Bean(name={"bean1_1","bean1_2"})
    public Bean1 bean1() {
        return new Bean1();
    }
}