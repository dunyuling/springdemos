package com.rc.aop.designators.execution;

import org.springframework.stereotype.Service;

/**
 * @ClassName ExpressionService
 * @Description com.rc.aop.designators--匹配表达式--方法类
 * @Author liux
 * @Date 19-4-17 下午12:38
 * @Version 1.0
 */
@Service
public class ExecutionService {

    public void m1() {
        System.out.println(this.getClass().getName() + " : m1()");
    }

    public void m2(String name) throws Exception {
        System.out.println(this.getClass().getName() + " : m2(" + name + ")");
        throw new Exception(this.getClass().getName() + " : m2(" + name + ")");
    }
}
