package com.rc.ioc.official.annotation.inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName MyConfiguration
 * @Description TODO
 * @Author liux
 * @Date 19-3-30 下午7:09
 * @Version 1.0
 */
@Configuration
@ComponentScan(value = {"com.rc.ioc.official.annotation.inject"},
        basePackageClasses = {com.rc.ioc.official.annotation.AnotherBean.class})
public class MyConfiguration {

    @Bean
    public List<String> stringList() {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        return list;
    }

    @Bean
    private String string3() {
        return "cc";
    }

    @Bean
    private String string4() {
        return "dd";
    }

    //被覆盖
    @Bean("integerList")
    public List<Integer> integerList() {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        return list;
    }

    @Bean
    @Order(4)
    public Integer integer3() {
        return 33;
    }

    @Bean
    @Order(3)
    public Integer integer4() {
        return 44;
    }

    @Bean
    public Map<String, Integer> integerMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("key5",55);
        map.put("key6",66);
        return map;
    }

    //TODO 课上老师说是KEY应该为String或者父类Object，亲测KEY为Integer也可以，应该还有一些地方没有理解到位
    @Bean
    public Map<Integer,Integer> map() {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(11,33);
        map.put(22,44);
        return map;
    }
}