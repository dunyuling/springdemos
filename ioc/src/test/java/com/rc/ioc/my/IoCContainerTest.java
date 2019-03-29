package com.rc.ioc.my;

import com.rc.ioc.my.car.Audi;
import com.rc.ioc.my.car.Buick;
import com.rc.ioc.my.human.Lisi;
import com.rc.ioc.my.human.Zhangsan;
import org.junit.Before;
import org.junit.Test;

/*
 * @ClassName IoCContainerTest
 * @Description 自定义IoCContainer测试
 * @Author liux
 * @Date 19-3-29 上午11:55
 * @Version 1.0
 */
public class IoCContainerTest {

    private IoCContainer ioCContainer = new IoCContainer();

    @Before
    public void before() {
        ioCContainer.setBean(Audi.class,"audi");
        ioCContainer.setBean(Buick.class,"buick");
        ioCContainer.setBean(Zhangsan.class,"zhangsan","audi");
        ioCContainer.setBean(Lisi.class,"lisi","buick");
    }

    @Test
    public void testGetBean() {
        Zhangsan zhangsan = (Zhangsan) ioCContainer.getBean("zhangsan");
        zhangsan.goHome();
        System.out.println();
        Lisi lisi = (Lisi) ioCContainer.getBean("lisi");
        lisi.goHome();
    }
}
