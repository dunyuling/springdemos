package com.rc.ioc.official.annotation.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ClassName PrototypeBean
 * @Description TODO
 * @Author liux
 * @Date 19-3-31 下午12:13
 * @Version 1.0
 */
@Component("prototypeBean1")
@Scope("prototype")
public class PrototypeBean {
}
