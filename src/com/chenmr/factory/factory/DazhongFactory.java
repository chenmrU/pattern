package com.chenmr.factory.factory;

import com.chenmr.factory.product.Car;
import com.chenmr.factory.product.Dazhong;

/**
 * Created by chenmr on 2018/4/5/005.
 */
public class DazhongFactory implements CarFatory {
    @Override
    public Car getCar() {
        return new Dazhong();
    }
}
