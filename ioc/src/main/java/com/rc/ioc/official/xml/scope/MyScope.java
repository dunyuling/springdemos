package com.rc.ioc.official.xml.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName MyScope
 * @Description 自定义作用域，本例为生成两份实例
 * @Author liux
 * @Date 19-3-29 下午7:13
 * @Version 1.0
 */
public class MyScope implements Scope {

    private Map<String,Object> map1 = new ConcurrentHashMap<>();
    private Map<String,Object> map2 = new ConcurrentHashMap<>();

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        if (!map1.containsKey(name)) {
            Object object = objectFactory.getObject();
            map1.put(name, object);
            return object;
        }
        if (!map2.containsKey(name)) {
            Object object = objectFactory.getObject();
            map2.put(name, object);
            return object;
        }
        return new Random().nextInt(2) == 0 ? map1.get(name) : map2.get(name);
    }

    @Override
    public Object remove(String name) {
        if (map1.containsKey(name)) {
            Object object = map1.get(name);
            map1.remove(name);
            return object;
        }
        if (map2.containsKey(name)) {
            Object object = map2.get(name);
            map2.remove(name);
            return object;
        }
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
