package com.rc.ioc.official.xml.scope;

import com.rc.ioc.official.xml.AnotherBean;

/*
 * @ClassName Bean
 * @Description Bean作用域
 * @Author liux
 * @Date 19-3-29 下午4:19
 * @Version 1.0
 */
public class Bean {

    private AnotherBean anotherBean;

    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "anotherBean=" + anotherBean +
                '}';
    }
}
