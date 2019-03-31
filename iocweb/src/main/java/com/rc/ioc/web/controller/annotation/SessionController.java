package com.rc.ioc.web.controller.annotation;

import org.springframework.context.annotation.Scope;
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
@Scope("session")
public class SessionController {

    @RequestMapping("testSession2")
    public String testSession() {
        return this.toString();
    }
}
