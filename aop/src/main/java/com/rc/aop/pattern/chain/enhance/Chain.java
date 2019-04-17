package com.rc.aop.pattern.chain.enhance;

import java.util.List;

/**
 * @ClassName Chain
 * @Description 抽象处理类的统一管理工具
 * @Author liux
 * @Date 19-4-17 下午11:13
 * @Version 1.0
 */
class Chain {

    private List<ChainHandler> chainHandlers;

    Chain(List<ChainHandler> chainHandlers) {
        this.chainHandlers = chainHandlers;
    }

    private int index = 0;

    void proceed() {
        if (index >= chainHandlers.size()) {
            return;
        }
        chainHandlers.get(index++).execute(this);
    }
}