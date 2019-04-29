package com.rc.transaction.declaration;

/**
 * @ClassName RollBackException
 * @Description 自定义回滚异常
 * @Author liux
 * @Date 19-4-29 上午11:40
 * @Version 1.0
 */
public class RollBackException extends Throwable {

    public RollBackException() {
        super();
    }

    public RollBackException(String message) {
        super(message);
    }
}
