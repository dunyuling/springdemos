package com.rc.ioc.my;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName Test
 * @Description TODO
 * @Author liux
 * @Date 19-3-29 上午12:25
 * @Version 1.0
 */
public class IoCContainer {

    private Map<String, Object> beans = new ConcurrentHashMap<>();

    /**
     * @Author liux
     * @Description 根据BeanId 获取一个bean
     * @Date 19-3-29 上午12:27
     * @param beanId
     * @return java.lang.Object
     **/
    public Object getBean(String beanId) {
        return beans.get(beanId);
    }

    /**
     * @Author liux
     * @Description 委托ioc容器创建一个bean
     * @Date 19-3-29 上午12:57
     * @param clazz 要创建的bean的class
     * @param beanId 每一个bean的唯一标识
     * @param paramBeanIds 要创建的bean的class的构造方法所需要的参数的beanId们
     * @return void
     **/
    public void setBean(Class<?> clazz, String beanId, String... paramBeanIds) {
        //1.组装构造方法所需要的参数
        Object[] paramValues = new Object[paramBeanIds.length];
        for (int i = 0; i < paramValues.length; i++) {
            paramValues[i] = beans.get(paramBeanIds[i]);
        }

        //2.调用构造方法实例化bean
        Object bean = null;
        for (Constructor<?> constructor : clazz.getConstructors()) {
            try {
                bean = constructor.newInstance(paramValues);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            }
        }
        if (bean == null) {
            throw new RuntimeException("找不到合适的构造方法去实例化bean");
        }

        //3.将实例化的bean放入beans
        beans.put(beanId, bean);
    }
}
