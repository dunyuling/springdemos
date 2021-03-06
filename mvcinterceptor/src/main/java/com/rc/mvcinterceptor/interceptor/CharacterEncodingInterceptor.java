package com.rc.mvcinterceptor.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName CharacterEncodingInterceptor
 * @Description CharacterEncodingInterceptor
 * @Author liux
 * @Date 19-4-28 下午12:04
 * @Version 1.0
 */
public class CharacterEncodingInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        System.out.println(this.getClass().getName() + " preHandler " + handler.getClass().getName());
        request.setCharacterEncoding("utf-8");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println(this.getClass().getName() + " postHandle ");
//        response.setCharacterEncoding("utf-8");
//        response.setCharacterEncoding("ISO-8859-1");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
        System.out.println(this.getClass().getName() + " afterCompletion ");
    }
}
