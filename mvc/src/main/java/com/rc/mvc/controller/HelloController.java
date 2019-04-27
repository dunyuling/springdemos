package com.rc.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName HelloController
 * @Description HelloController class
 * @Author liux
 * @Date 19-4-24 下午6:44
 * @Version 1.0
 */
@Controller
public class HelloController {

    @RequestMapping("hello.do")
    public String hello() {
        return "hello";
    }

}
