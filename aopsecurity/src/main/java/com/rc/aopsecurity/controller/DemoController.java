package com.rc.aopsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Description rest 风格访问类
 * @Author liux
 * @Date 19-4-19 上午10:30
 * @Version 1.0
 */
@RestController
public class DemoController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/common")
    public String commonAccess() {
        return "only login can view";
    }

    @RequestMapping("/admin")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String admin() {
        return "only admin can access";
    }
}
