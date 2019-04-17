package com.rc.aop.pattern.chain.enhance;

/**
 * @ClassName ChainHandler
 * @Description 抽象处理类--加强版
 * @Author liux
 * @Date 19-4-17 下午11:12
 * @Version 1.0
 */
public abstract class ChainHandler {

    public void execute(Chain chain) {
        handleProcess();
        chain.proceed();
    }

    protected abstract void handleProcess();
}
