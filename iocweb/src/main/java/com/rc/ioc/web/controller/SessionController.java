package com.rc.ioc.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RequestController
 * @Description TODO
 * @Author liux
 * @Date 19-3-29 下午6:30
 * @Version 1.0
 */
@RestController
public class SessionController {

    @RequestMapping("testSession")
    public String testSession() {
        return this.toString();
    }
}
