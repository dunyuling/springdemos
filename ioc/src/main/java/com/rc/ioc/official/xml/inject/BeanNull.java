package com.rc.ioc.official.xml.inject;

import com.rc.ioc.official.xml.AnotherBean;

/**
 * @ClassName BeanNull
 * @Description null值注入
 * @Author liux
 * @Date 19-3-29 下午3:40
 * @Version 1.0
 */
public class BeanNull {

    private AnotherBean anotherBean;

    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    @Override
    public String toString() {
        return "BeanNull{" +
                "anotherBean=" + anotherBean +
                '}';
    }
}
