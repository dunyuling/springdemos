package com.rc.ioc.my.human;

import com.rc.ioc.my.car.Car;

/**
 * @ClassName Zhangsan
 * @Description 具体实现---Zhangsan
 * @Author liux
 * @Date 19-3-28 下午11:44
 * @Version 1.0
 */
public class Zhangsan extends HumanWithCar {

    public Zhangsan(Car car) {
        super(car);
    }

    @Override
    public void goHome() {
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
    }
}
