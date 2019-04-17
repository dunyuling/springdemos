package com.rc.aop.advice;

import org.springframework.stereotype.Service;

import javax.management.relation.RoleUnresolved;

/**
 * @ClassName AdviceService
 * @Description 5种advice的用法--方法类
 * @Author liux
 * @Date 19-4-17 下午1:28
 * @Version 1.0
 */
@Service
public class AdviceService {

    public void before(Long id) {
        System.out.println(this.getClass().getName() + " : before(" + id + ")");
    }

    public void after() {
        System.out.println(this.getClass().getName() + " : after()");
    }

    public String afterReturning() {
        System.out.println(this.getClass().getName() + " : afterReturning()");
        return " advice afterReturning";
    }

    public void afterThrowing() throws RuntimeException {
        System.out.println(this.getClass().getName() + " : afterThrowing()");
        throw new RuntimeException("advice afterThrowing");
    }

    public String around(String name) {
        System.out.println(this.getClass().getName() + " : around(" + name + ")");
        return "around name";
    }
}
