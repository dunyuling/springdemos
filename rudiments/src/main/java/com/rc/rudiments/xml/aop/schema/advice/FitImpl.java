package com.rc.rudiments.xml.aop.schema.advice;

import org.springframework.stereotype.Component;

/**
 * @ClassName FitImpl
 * @Description Introductions FitImpl 实现类
 * @Author liux
 * @Date 19-4-23 下午5:01
 * @Version 1.0
 */
@Component
public class FitImpl implements Fit {
    @Override
    public void filter() {
        System.out.println(this.getClass().getName() + ": filter()");
    }
}
