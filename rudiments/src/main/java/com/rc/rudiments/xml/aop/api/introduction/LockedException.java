package com.rc.rudiments.xml.aop.api.introduction;

/**
 * @ClassName LockedException
 * @Description 自定义锁异常
 * @Author liux
 * @Date 19-4-23 下午7:18
 * @Version 1.0
 */
public class LockedException extends RuntimeException {

    public LockedException() {
        super();
    }

    public LockedException(String message) {
        super(message);
    }
}
