package com.chenmr.factory.factory;

import com.chenmr.factory.product.Baoma;
import com.chenmr.factory.product.Car;

/**
 * Created by Administrator on 2018/4/5/005.
 */
public class BaomaFactory implements CarFatory {


    @Override
    public Car getCar() {
        return new Baoma();
    }
}
