package com.rc.ioc.official.annotation.scope;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @ClassName MethodPrototypeBean
 * @Description TODO
 * @Author liux
 * @Date 19-3-31 下午12:23
 * @Version 1.0
 */
@Component
public abstract class MethodPrototypeBean {

    @Lookup
    protected abstract SecondBean createSecondBean();

    public void printSecondBean() {
        System.out.println("anotherBean = " + createSecondBean());
    }
}
