package com.rc.rudiments.xml.aop.api;

/**
 * @ClassName BizLogicImpl
 * @Description BizLogicImpl实现类
 * @Author liux
 * @Date 19-4-23 下午6:30
 * @Version 1.0
 */
public class BizLogicImpl implements BizLogic {
    @Override
    public String save() {
        System.out.println("BizLogicImpl : 'BizLogicImpl save.'");
        return "'BizLogicImpl save.'";
//        		throw new RuntimeException();
    }
}
