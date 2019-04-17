package com.rc.aop.designators.args;

import org.springframework.stereotype.Service;

/**
 * @ClassName ArgService
 * @Description com.rc.aop.designators--匹配参数--方法类
 * @Author liux
 * @Date 19-4-16 下午6:18
 * @Version 1.0
 */
@Service
public class ArgService {

    public void findById(Long id) {
        System.out.println(this.getClass().getName() + " : find(Long id)");
    }

    public void findByIdAndName(Long id, String name) {
        System.out.println(this.getClass().getName() + " : findByIdAndName(Long id,String name)");
    }
}