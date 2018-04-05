package com.chenmr.factory;


import com.chenmr.factory.abstractFactory.CarFactory;
import com.chenmr.factory.product.Car;

/**
 * Created by Administrator on 2018/4/5/005.
 */
public class FactoryTest {

    public static void main(String[] args){

        /*Car car = CarFactory.getCar("宝马");
        car.display();*/

        /*BaomaFactory baomaFactory = new BaomaFactory();
        Car baoma = baomaFactory.getCar();*/

        CarFactory carFactory = new CarFactory();
        Car baoma = carFactory.getBaoma();
        Car dazhong = carFactory.getDazhong();

    }

}
