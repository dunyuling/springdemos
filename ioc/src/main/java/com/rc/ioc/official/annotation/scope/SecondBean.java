package com.rc.ioc.official.annotation.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ClassName SecondBean
 * @Description TODO
 * @Author liux
 * @Date 19-3-31 下午12:27
 * @Version 1.0
 */
@Component
@Scope("prototype")
public class SecondBean {
}
