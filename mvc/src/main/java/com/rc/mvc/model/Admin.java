package com.rc.mvc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName Admin
 * @Description Admin类--配合演示数据绑定
 * @Author liux
 * @Date 19-4-29 下午4:26
 * @Version 1.0
 */
@XmlRootElement(name="Admin")
public class Admin {

    private String name;
    private int age;

    @XmlElement(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name="age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
