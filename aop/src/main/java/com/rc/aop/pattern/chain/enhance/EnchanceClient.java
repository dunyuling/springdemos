package com.rc.aop.pattern.chain.enhance;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName EnchanceClient
 * @Description 责任链模式客户端--加强版
 * @Author liux
 * @Date 19-4-17 下午11:18
 * @Version 1.0
 */
public class EnchanceClient {

    static class ChainHandlerA extends ChainHandler {

        @Override
        protected void handleProcess() {
            System.out.println(this.getClass().getName());
        }
    }

    static class ChainHandlerB extends ChainHandler {

        @Override
        protected void handleProcess() {
            System.out.println(this.getClass().getName());
        }
    }

    static class ChainHandlerC extends ChainHandler {

        @Override
        protected void handleProcess() {
            System.out.println(this.getClass().getName());
        }
    }

    static class ChainHandlerD extends ChainHandler {

        @Override
        protected void handleProcess() {
            System.out.println(this.getClass().getName());
        }
    }

    public static void main(String[] args) {
        List<ChainHandler> handlers = Arrays.asList(
                new ChainHandlerA(),
                new ChainHandlerB(),
                new ChainHandlerC()
        );

        //Exception in thread "main" java.lang.UnsupportedOperationException
        //handlers -- fixed-size list
//        handlers.add(new ChainHandlerD());


        Chain chain = new Chain(handlers);
        chain.proceed();
    }
}