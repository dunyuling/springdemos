package com.rc.aop.designators.pkg.sub;

import org.springframework.stereotype.Service;

/**
 * @ClassName PkgSubService
 * @Description com.rc.aop.designators--匹配包/类型--子包--方法类
 * @Author liux
 * @Date 19-4-16 下午5:42
 * @Version 1.0
 */
@Service
public class PkgSubService {

    public void m1() {
        System.out.println(this.getClass().getName() + " : m1()");
    }
}
