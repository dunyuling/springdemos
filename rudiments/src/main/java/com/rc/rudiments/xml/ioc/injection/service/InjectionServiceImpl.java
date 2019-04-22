package com.rc.rudiments.xml.ioc.injection.service;

import com.rc.rudiments.xml.ioc.injection.dao.InjectionDAO;

/**
 * @ClassName InjectionServiceImpl
 * @Description InjectionService 实现类
 * @Author liux
 * @Date 19-4-21 下午5:00
 * @Version 1.0
 */
public class InjectionServiceImpl implements InjectionService {

    private InjectionDAO injectionDAO;

    public InjectionServiceImpl() {
    }

    public InjectionServiceImpl(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    public InjectionDAO getInjectionDAO() {
        return injectionDAO;
    }

    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    @Override
    public void save(String arg) {
        //模拟业务操作
        System.out.println("Service接收参数：" + arg);
        arg = arg + ":" + this.hashCode();
        injectionDAO.save(arg);
    }
}
