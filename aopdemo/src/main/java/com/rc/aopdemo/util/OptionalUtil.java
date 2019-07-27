package com.rc.aopdemo.util;

import java.util.Optional;

/**
 * @ClassName OptionalUtil
 * @Description TODO
 * @Author liux
 * @Date 19-7-27 上午11:58
 * @Version 1.0
 */
public class OptionalUtil {


    /*
     * @Author liux
     * @Description 获取Optional 类的具体泛型
     * @Date 19-7-27 下午12:03
     * @param obj
     * @return java.lang.Object
     **/
    public static Object getGenericType(Object obj) {
        if (obj instanceof Optional) {
            //TODO 获取不到 Optional 内类的真实类型,这个方法 就没有了存在的必要
            return ((Optional) obj).isPresent() ? ((Optional) obj).get() : obj;
        }
        return obj;
    }
}