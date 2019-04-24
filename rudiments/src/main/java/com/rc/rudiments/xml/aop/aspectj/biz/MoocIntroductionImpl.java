package com.rc.rudiments.xml.aop.aspectj.biz;

import com.rc.rudiments.xml.aop.aspectj.MoocAspect;

/**
 * @ClassName MoocIntroductionImpl
 * @Description MoocIntroductionImpl 实现类
 * @Author liux
 * @Date 19-4-24 下午1:00
 * @Version 1.0
 */
public class MoocIntroductionImpl implements MoocIntroduction {
    @Override
    public void hello(String arg) {
        System.out.println("MoocIntroductionImpl hello " + arg);
    }
}
