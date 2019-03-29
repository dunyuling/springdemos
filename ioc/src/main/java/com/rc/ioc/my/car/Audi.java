package com.rc.ioc.my.car;

/**
 * @ClassName Audi
 * @Description Audi类实现
 * @Author liux
 * @Date 19-3-28 下午11:39
 * @Version 1.0
 */
public class Audi implements Car {

    @Override
    public void start() {
        System.out.println("Audi start");
    }

    @Override
    public void stop() {
        System.out.println("Audi stop");
    }

    @Override
    public void turnLeft() {
        System.out.println("Audi turnLeft");
    }

    @Override
    public void turnRight() {
        System.out.println("Audi turnRight");
    }
}
