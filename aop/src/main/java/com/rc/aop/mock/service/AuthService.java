package com.rc.aop.mock.service;

import com.rc.aop.mock.security.CurrentUserHolder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @ClassName AuthService
 * @Description 认证服务类
 * @Author liux
 * @Date 19-4-16 下午12:04
 * @Version 1.0
 */
@Component
public class AuthService {

    public void check() {
        if (!CurrentUserHolder.get().equals("admin")) {
            throw new RuntimeException("only admin is allowed");
        }
    }
}
