package com.rc.mvcinterceptor.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName Interceptor2
 * @Description 拦截器测试类
 * @Author liux
 * @Date 19-4-28 下午12:04
 * @Version 1.0
 */
public class Interceptor2 implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        System.out.println(this.getClass().getName() + " preHandler " + handler.getClass().getName());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println(this.getClass().getName() + " postHandle ");
        modelAndView.addObject("msg","from " + this.getClass().getName() + "::postHandler");
        modelAndView.setViewName("/hello2.jsp");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
        System.out.println(this.getClass().getName() + " afterCompletion ");
    }
}
