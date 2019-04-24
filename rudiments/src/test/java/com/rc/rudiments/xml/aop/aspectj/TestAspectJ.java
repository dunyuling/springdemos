package com.rc.rudiments.xml.aop.aspectj;

import com.rc.rudiments.base.UnitTestBase;
import com.rc.rudiments.xml.aop.aspectj.biz.MoocBiz;
import com.rc.rudiments.xml.aop.aspectj.biz.MoocIntroduction;
import com.rc.rudiments.xml.aop.aspectj.biz.MoocIntroductionImpl;
import org.junit.Test;

/**
 * @ClassName TestAspectJ
 * @Description TODO
 * @Author liux
 * @Date 19-4-24 下午12:09
 * @Version 1.0
 */
public class TestAspectJ extends UnitTestBase {

    public TestAspectJ() {
        super("classpath:spring-aop-aspectj.xml");
    }

    @Test
    public void testBefore() {
        MoocBiz moocBiz = super.getBean("moocBiz");
        moocBiz.save("testBefore");
    }

    @Test
    public void testBeforeWithParam() {
        MoocBiz moocBiz = super.getBean("moocBiz");
        moocBiz.save("testBeforeWithParam");
    }

    @Test
    public void testBeforeWithAnnotaion() {
        MoocBiz moocBiz = super.getBean("moocBiz");
        moocBiz.save("testBeforeWithAnnotaion");
    }

    @Test
    public void testAfterReturning() {
        MoocBiz moocBiz = super.getBean("moocBiz");
        moocBiz.save("testAfterReturning");
    }

    @Test
    public void testAfterThrowing() {
        MoocBiz moocBiz = super.getBean("moocBiz");
        moocBiz.save("testAfterThrowing");
    }

    @Test
    public void testAfter() {
        MoocBiz moocBiz = super.getBean("moocBiz");
        moocBiz.save("testAfter");
    }

    @Test
    public void testAround() {
        MoocBiz moocBiz = super.getBean("moocBiz");
        moocBiz.save("testAround");
    }

    @Test
    public void testIntroduction() {
        MoocIntroduction moocIntroduction = super.getBean("moocBiz");
        moocIntroduction.hello("world");
    }

}
