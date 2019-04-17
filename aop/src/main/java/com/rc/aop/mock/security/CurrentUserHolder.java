package com.rc.aop.mock.security;

/**
 * @ClassName CurrentUserHolder
 * @Description 用户名称共享类
 * @Author liux
 * @Date 19-4-16 上午11:50
 * @Version 1.0
 */
public class CurrentUserHolder {

    private static final ThreadLocal<String> holder = new ThreadLocal<>();

    public static String get() {
        return holder.get() == null ? "unknown" :holder.get();
    }

    public static void set(String user) {
        holder.set(user);
    }
}
