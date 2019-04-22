package com.rc.rudiments.annotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

/**
 * @ClassName BeanConfig
 * @Description Bean配置文件
 * @Author liux
 * @Date 19-4-22 下午5:29
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.rc.rudiments.annotation")

public class BeanConfig {

    @Autowired
    private Store<String> stringStore;

    @Autowired
    private Store<Integer> integerStore;


    @Bean
    @Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
    public MyDriverManager myDriverManager() {
        return new MyDriverManager();
    }

    public void printGenericAutowire() {
        System.out.println(stringStore.getClass().getName() + " " + stringStore.hashCode());
        System.out.println(integerStore.getClass().getName() + " " + integerStore.hashCode());
    }
}
