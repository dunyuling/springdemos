package com.rc.aop.pattern.chain.basis;

/**
 * @ClassName BasisClient
 * @Description 责任链模式客户端--基础版
 * @Author liux
 * @Date 19-4-17 下午10:55
 * @Version 1.0
 */
public class BasisClient {

    static class BasisHandlerA extends BasisHandler {

        @Override
        protected void handleProcess() {
            System.out.println("BasisHandlerA");
        }
    }

    static class BasisHandlerB extends BasisHandler {

        @Override
        protected void handleProcess() {
            System.out.println("BasisHandlerB");
        }
    }

    static class BasisHandlerC extends BasisHandler {

        @Override
        protected void handleProcess() {
            System.out.println("BasisHandlerC");
        }
    }


    public static void main(String[] args) {
        BasisHandlerA handlerA = new BasisHandlerA();
        BasisHandlerB handlerB = new BasisHandlerB();
        BasisHandlerC handlerC = new BasisHandlerC();

        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        handlerA.execute();
    }
}
