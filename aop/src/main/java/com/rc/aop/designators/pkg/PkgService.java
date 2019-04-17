package com.rc.aop.designators.pkg;

import org.springframework.stereotype.Service;

/**
 * @ClassName PkgService
 * @Description  com.rc.aop.designators--匹配包/类型--方法类
 * @Author liux
 * @Date 19-4-16 下午5:35
 * @Version 1.0
 */
@Service
public class PkgService {

    public void m1() {
        System.out.println(this.getClass().getName() + " : m1()");
    }

    public void m2() {
        System.out.println(this.getClass().getName() + " : m2()");
    }


}
