package com.rc.aop.designators;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;

/**
 * @ClassName IAspect
 * @Description com.rc.aop.designators--切面类--接口
 * @Author liux
 * @Date 19-4-16 下午6:47
 * @Version 1.0
 */
public interface IAspect {

    void pointMethod();

    void adviceBeforeMethod();

    void adviceAfterMethod();
}
