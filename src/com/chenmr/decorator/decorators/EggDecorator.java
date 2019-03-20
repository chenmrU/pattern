package com.chenmr.decorator.decorators;

import com.chenmr.decorator.old.Cake;

public class EggDecorator implements Decorators {

    public EggDecorator(Cake cake) {
        this.cake = cake;
    }

    private Cake cake;

    @Override
    public String getMessage() {
        return cake.getMessage() + "加1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return cake.getPrice() + 1;
    }
}
