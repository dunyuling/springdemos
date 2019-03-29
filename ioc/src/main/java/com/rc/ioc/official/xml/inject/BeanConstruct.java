package com.rc.ioc.official.xml.inject;

import com.rc.ioc.official.xml.AnotherBean;

/**
 * @ClassName BeanSet
 * @Description 构造方式注入
 * @Author liux
 * @Date 19-3-29 下午2:27
 * @Version 1.0
 */
public class BeanConstruct {

    private AnotherBean anotherBean;
    private String name;

    public BeanConstruct(AnotherBean anotherBean, String name) {
        this.anotherBean = anotherBean;
        this.name = name;
    }

    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BeanSet{" +
                "anotherBean=" + anotherBean +
                ", name='" + name + '\'' +
                '}';
    }
}
