package com.rc.ioc.official.annotation.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @ClassName LazyBean
 * @Description 测试懒加载
 * @Author liux
 * @Date 19-3-31 下午2:25
 * @Version 1.0
 */
@Component
@Lazy
public class LazyBean {

    public LazyBean() {
        System.out.println("LazyBean constructor");
    }
}
