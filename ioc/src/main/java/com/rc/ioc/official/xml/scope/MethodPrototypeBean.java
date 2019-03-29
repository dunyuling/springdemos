package com.rc.ioc.official.xml.scope;

import com.rc.ioc.official.xml.AnotherBean;

/**
 * @ClassName MethodPrototypeBean
 * @Description bean依赖anotherBean, bean为singleton, anotherBean为prototype时，
 *               让anotherBean每次产生新的实例
 * @Author liux
 * @Date 19-3-29 下午5:26
 * @Version 1.0
 */
public abstract class MethodPrototypeBean {

    protected abstract AnotherBean createAnotherBean();

    public void printAnotherBean() {
        System.out.println("anotherBean = " + createAnotherBean());
    }
}
