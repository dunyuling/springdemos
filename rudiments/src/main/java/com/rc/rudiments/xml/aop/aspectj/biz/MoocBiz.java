package com.rc.rudiments.xml.aop.aspectj.biz;

import com.rc.rudiments.xml.aop.aspectj.MoocMethod;
import org.springframework.stereotype.Service;

/**
 * @ClassName MoocBiz
 * @Description 业务类
 * @Author liux
 * @Date 19-4-24 下午12:07
 * @Version 1.0
 */
@Service
public class MoocBiz {

    @MoocMethod("MoocBiz save with MoocMethod.")
    public String save(String arg) {
        System.out.println("MoocBiz save : " + arg);
//		throw new RuntimeException(" Save failed!");
        return " Save success!";
    }
}
