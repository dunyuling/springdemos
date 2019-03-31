package com.rc.ioc.official.annotation.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @ClassName NotLazyBean
 * @Description TODO
 * @Author liux
 * @Date 19-3-31 下午2:26
 * @Version 1.0
 */
@Component
@Lazy(false)
public class NotLazyBean {

    public NotLazyBean() {
        System.out.println("NotLazyBean constructor");
    }
}
