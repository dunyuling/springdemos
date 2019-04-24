package com.rc.rudiments.xml.aop.api.introduction;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * @ClassName LockMixin
 * @Description LockMixin逻辑类
 * @Author liux
 * @Date 19-4-23 下午7:16
 * @Version 1.0
 */
public class LockMixin extends DelegatingIntroductionInterceptor implements Lockable {

    private boolean locked;

    @Override
    public void lock() {
        this.locked = true;
    }

    @Override
    public void unlock() {
        this.locked = false;
    }

    @Override
    public boolean locked() {
        return this.locked;
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        if (locked() && mi.getMethod().getName().indexOf("set") == 0) {
            throw new LockedException("不能使用set方法");
        }
        return super.invoke(mi);
    }
}


