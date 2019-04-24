package com.rc.rudiments.xml.aop.api;

import com.rc.rudiments.base.UnitTestBase;
import org.junit.Test;

/**
 * @ClassName TestApi
 * @Description Spring aop api测试类
 * @Author liux
 * @Date 19-4-23 下午6:32
 * @Version 1.0
 */
public class TestApi extends UnitTestBase {

    public TestApi() {
        super("classpath:spring-aop-api.xml");
    }

    @Test
    public void testSave() {
        BizLogic bizLogic = super.getBean("bizLogicImpl", BizLogic.class);
        bizLogic.save();
    }

}
