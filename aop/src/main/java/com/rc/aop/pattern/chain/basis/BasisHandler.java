package com.rc.aop.pattern.chain.basis;

/**
 * @ClassName BasisHandler
 * @Description 抽象处理类--基础版
 * @Author liux
 * @Date 19-4-17 下午10:50
 * @Version 1.0
 */
public abstract class BasisHandler {

    private BasisHandler successor;

    public BasisHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(BasisHandler successor) {
        this.successor = successor;
    }

    public void execute() {
        handleProcess();
        if (getSuccessor() != null) {
            getSuccessor().execute();
        }
    }

    protected abstract void handleProcess();
}
