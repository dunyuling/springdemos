package com.rc.ioc.official.annotation.lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyConfiguration
 * @Description Bean的懒加载注解方式配置
 * @Author liux
 * @Date 19-3-31 下午2:25
 * @Version 1.0
 */
@Component
@ComponentScan("com.rc.ioc.official.annotation.lazy")
//所有配置在该类中的Bean都会被懒加载
@Lazy
public class MyConfiguration {

    @Bean
    public com.rc.ioc.official.annotation.lazy.Bean bean1() {
        return new com.rc.ioc.official.annotation.lazy.Bean();
    }

    @Bean
    public com.rc.ioc.official.annotation.lazy.Bean bean2() {
        return new com.rc.ioc.official.annotation.lazy.Bean();
    }

}
