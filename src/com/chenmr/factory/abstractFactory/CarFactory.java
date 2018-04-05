package com.chenmr.factory.abstractFactory;

import com.chenmr.factory.product.Car;
import com.chenmr.factory.factory.BaomaFactory;
import com.chenmr.factory.factory.DazhongFactory;

/**
 * Created by Administrator on 2018/4/5/005.
 */
public class CarFactory extends AbstractFactory {
    @Override
    public Car getBaoma() {
        return new BaomaFactory().getCar();
    }

    @Override
    public Car getDazhong() {
        return new DazhongFactory().getCar();
    }
}
