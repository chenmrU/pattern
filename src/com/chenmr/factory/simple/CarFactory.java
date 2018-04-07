package com.chenmr.factory.simple;

import com.chenmr.factory.product.Baoma;
import com.chenmr.factory.product.Car;
import com.chenmr.factory.product.Dazhong;

/**
 * Created by chenmr on 2018/4/5/005.
 */
public class CarFactory {

    public static Car getCar(String carName){
        if("宝马".equals(carName)){
            return new Baoma();
        }else if ("大众".equals(carName)){
            return new Dazhong();
        }else{
            return null;
        }
    }


}
