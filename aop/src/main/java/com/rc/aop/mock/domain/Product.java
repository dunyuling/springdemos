package com.rc.aop.mock.domain;

/**
 * @ClassName Product
 * @Description 产品类
 * @Author liux
 * @Date 19-4-16 上午11:39
 * @Version 1.0
 */
public class Product {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}