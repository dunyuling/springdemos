package com.rc.aop.mock.security;

import com.rc.aop.mock.service.AuthService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName SecurityAspect
 * @Description 安全切面类
 * @Author liux
 * @Date 19-4-16 下午12:40
 * @Version 1.0
 */
@Aspect
@Component
public class SecurityAspect {

    @Autowired
    AuthService authService;

    @Pointcut("execution(public * com.rc.aop.mock.service..*.delete(..))")//完全地与代码分离
    public void adminOnly() {

    }

    @Before("adminOnly()")
    public void checkAccess() {
        authService.check();
    }
}