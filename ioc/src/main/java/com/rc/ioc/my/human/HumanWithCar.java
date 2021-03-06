package com.rc.ioc.my.human;

import com.rc.ioc.my.car.Car;

/**
 * @ClassName HumanWithCar
 * @Description HumanWithCar--只能为抽象类,不同人具体goHome()等方法不同
 * @Author liux
 * @Date 19-3-28 下午11:42
 * @Version 1.0
 */
public abstract class HumanWithCar implements Human {

    protected Car car;

    public HumanWithCar(Car car) {
        this.car = car;
    }

    @Override
    public abstract void goHome();
}
