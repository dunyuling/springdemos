package com.rc.ioc.my.car;

/**
 * @ClassName Buick
 * @Description Buck类实现
 * @Author liux
 * @Date 19-3-28 下午11:40
 * @Version 1.0
 */
public class Buick implements Car {
    @Override
    public void start() {
        System.out.println("Buick start");
    }

    @Override
    public void stop() {
        System.out.println("Buick stop");
    }

    @Override
    public void turnLeft() {
        System.out.println("Buick turnLeft");
    }

    @Override
    public void turnRight() {
        System.out.println("Buick turnRight");
    }
}
