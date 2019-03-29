package com.rc.ioc.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ApplicationController
 * @Description Application作用域下实例个数
 * @Author liux
 * @Date 19-3-29 下午6:30
 * @Version 1.0
 */
@RestController
public class ApplicationController {

    @RequestMapping("testApplication")
    public String testApplication() {
        return this.toString();
    }
}
