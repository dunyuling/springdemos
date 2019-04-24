package com.rc.rudiments.xml.aop.api.introduction;

/**
 * @ClassName Lockable
 * @Description Lockable 接口类
 * @Author liux
 * @Date 19-4-23 下午7:16
 * @Version 1.0
 */
public interface Lockable {
    void lock();

    void unlock();

    boolean locked();
}
