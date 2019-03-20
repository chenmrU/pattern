package com.chenmr.decorator;

import com.chenmr.decorator.decorators.Decorators;
import com.chenmr.decorator.decorators.EggDecorator;
import com.chenmr.decorator.old.BaseCake;

public class DecoratorTest {

    public static void main(String[] args) {
        Decorators decorators = new EggDecorator(new BaseCake());

        System.out.println(decorators.getMessage() + "：" + decorators.getPrice() + "元");

    }

}
