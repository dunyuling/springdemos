package com.rc.rudiments.xml.aop.schema.advice;

import com.rc.rudiments.base.UnitTestBase;
import com.rc.rudiments.xml.aop.schema.advice.biz.AspectBiz;
import org.junit.Test;

/**
 * @ClassName TestAspectBiz
 * @Description AspectBiz结合切面的测试类
 * @Author liux
 * @Date 19-4-23 下午12:27
 * @Version 1.0
 */
public class TestAspectBiz extends UnitTestBase {

    public TestAspectBiz() {
        super("classpath:spring-aop-schema-advice.xml");
    }

    /*
     * @Author liux
     * @Description biz() test
     * @Date 19-4-23 下午12:28
     * @param
     * @return void
     **/
    @Test
    public void testBiz() throws Exception {
        AspectBiz aspectBiz = super.getBean("aspectBiz", AspectBiz.class);
        aspectBiz.biz();
    }

    /*
     * @Author liux
     * @Description Advice parameters -- test init() test
     * @Date 19-4-23 下午4:39
     * @param
     * @return void
     **/
    @Test
    public void testInit() throws Exception {
        AspectBiz aspectBiz = super.getBean("aspectBiz", AspectBiz.class);
        aspectBiz.init("init", 1);
    }


    /*
     * @Author liux
     * @Description 为指定包下的类声明一个新的父类,与通知不能同时使用
     * @Date 19-4-23 下午5:31
     * @param 
     * @return void
     **/
    @Test
    public void testIntroduction() {
        Fit fit = super.getBean("aspectBiz");
        fit.filter();
    }
}
