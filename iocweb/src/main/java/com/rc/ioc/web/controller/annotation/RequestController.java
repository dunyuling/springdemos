package com.rc.ioc.web.controller.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RequestController
 * @Description Request作用域下实例个数
 * @Author liux
 * @Date 19-3-29 下午6:30
 * @Version 1.0
 */
@RestController
@Scope("request")
public class RequestController {

    @RequestMapping("testRequest2")
    public String testRequest() {
        return this.toString();
    }
}
