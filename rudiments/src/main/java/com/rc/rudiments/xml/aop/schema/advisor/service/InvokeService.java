package com.rc.rudiments.xml.aop.schema.advisor.service;

import org.springframework.dao.PessimisticLockingFailureException;

/**
 * @ClassName InvokeService
 * @Description 业务类
 * @Author liux
 * @Date 19-4-23 下午5:50
 * @Version 1.0
 */
public class InvokeService {

    public void invoke() {
        System.out.println("InvokeService ......");
    }

    public void invokeException() {
        throw new PessimisticLockingFailureException("");
    }
}
