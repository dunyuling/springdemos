package com.rc.ioc.official.annotation.inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @ClassName BeanCollection
 * @Description 集合类型注入
 * @Author liux
 * @Date 19-3-30 下午7:32
 * @Version 1.0
 */
@Component
public class BeanCollection {

    private List<String> stringList;

    public List<String> getStringList() {
        return stringList;
    }

    @Autowired
    //没有下面一行stringList会被改变成"cc","dd"
    @Qualifier("stringList")
    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    private List<Integer> integerList;

    public List<Integer> getIntegerList() {
        return integerList;
    }

    //integerList实际上填充的是44,33
    @Autowired
    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }

    private Map<String, Integer> integerMap;

    public Map<String, Integer> getIntegerMap() {
        return integerMap;
    }

    @Autowired
    @Qualifier("integerMap")
    public void setIntegerMap(Map<String, Integer> integerMap) {
        this.integerMap = integerMap;
    }


    private Map<Integer, Integer> map;

    public Map<Integer, Integer> getMap() {
        return map;
    }

    @Autowired
    @Qualifier("map")
    public void setMap(Map<Integer, Integer> map) {
        this.map = map;
    }
}
