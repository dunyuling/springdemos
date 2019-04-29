package com.rc.ioc.my.human;

import com.rc.ioc.my.car.Car;

/**
 * @ClassName Lisi
 * @Description 具体实现---Lisi
 * @Author liux
 * @Date 19-3-28 下午11:48
 * @Version 1.0
 */
public class Lisi extends HumanWithCar {

    public Lisi(Car car) {
        super(car);
    }

    @Override
    public void goHome() {
        car.start();
        car.stop();
    }
}
