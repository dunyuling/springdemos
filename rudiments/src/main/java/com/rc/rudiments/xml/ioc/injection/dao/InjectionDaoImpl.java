package com.rc.rudiments.xml.ioc.injection.dao;

/**
 * @ClassName InjectionDaoImpl
 * @Description InjectionDAO实现类
 * @Author liux
 * @Date 19-4-21 下午5:02
 * @Version 1.0
 */
public class InjectionDaoImpl implements InjectionDAO {
    @Override
    public void save(String arg) {
        //模拟数据库保存操作
        System.out.println("保存数据：" + arg);
    }
}
