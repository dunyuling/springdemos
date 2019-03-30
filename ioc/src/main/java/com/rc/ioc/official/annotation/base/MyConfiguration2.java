package com.rc.ioc.official.annotation.base;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyConfiguration2
 * @Description 通过注解生成Bean实例-component方式
 * @Author liux
 * @Date 19-3-30 下午6:26
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = {"com.rc.ioc.official.annotation.base"})
public class MyConfiguration2 {
}
