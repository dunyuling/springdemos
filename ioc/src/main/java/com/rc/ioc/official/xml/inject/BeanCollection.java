package com.rc.ioc.official.xml.inject;

import com.rc.ioc.official.xml.AnotherBean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName BeanCollection
 * @Description 集合类Bean的注入
 * @Author liux
 * @Date 19-3-29 下午3:22
 * @Version 1.0
 */
public class BeanCollection {

    private List<String> stringList;
    private List<AnotherBean> anotherBeanList;

    private Map<String,String> stringMap;
    private Map<AnotherBean,AnotherBean> anotherBeanMap;

    private Set<String> stringSet;
    private Set<AnotherBean> anotherBeanSet;

    private Properties properties;

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public List<AnotherBean> getAnotherBeanList() {
        return anotherBeanList;
    }

    public void setAnotherBeanList(List<AnotherBean> anotherBeanList) {
        this.anotherBeanList = anotherBeanList;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public Map<AnotherBean, AnotherBean> getAnotherBeanMap() {
        return anotherBeanMap;
    }

    public void setAnotherBeanMap(Map<AnotherBean, AnotherBean> anotherBeanMap) {
        this.anotherBeanMap = anotherBeanMap;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public Set<AnotherBean> getAnotherBeanSet() {
        return anotherBeanSet;
    }

    public void setAnotherBeanSet(Set<AnotherBean> anotherBeanSet) {
        this.anotherBeanSet = anotherBeanSet;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String   toString() {
        return "BeanCollection{" +
                "\nstringList=" + stringList +
                "\n, anotherBeanList=" + anotherBeanList +
                "\n, stringMap=" + stringMap +
                "\n, anotherBeanMap=" + anotherBeanMap +
                "\n, stringSet=" + stringSet +
                "\n, anotherBeanSet=" + anotherBeanSet +
                "\n, properties=" + properties +
                '}';
    }
}
