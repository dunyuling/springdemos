package com.rc.mvcinterceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName TestController
 * @Description TestController类
 * @Author liux
 * @Date 19-4-28 上午10:55
 * @Version 1.0
 */
@Controller
//@RequestMapping("/")
public class TestController {

    @RequestMapping("/viewAll")
    public ModelAndView viewAll(String name, String password) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name",name);
        modelAndView.addObject("password",password);
        System.out.println("进入了控制器的viewAll()方法...");
        System.out.println("name=" + name);
        System.out.println("password=" + password);
        modelAndView.setViewName("/hello1.jsp");
        modelAndView.addObject("msg","from " + this.getClass().getName() + "::viewAll");
        return modelAndView;
    }

    @RequestMapping("/query")
    public ModelAndView query() {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("进入了控制器的query()方法...");
        modelAndView.setViewName("/hello1.jsp");
        return modelAndView;
    }
}
