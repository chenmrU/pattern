package com.chenmr.decorator.old;

public class BaseCake implements Cake {

    @Override
    public String getMessage() {
        return "蛋糕";
    }

    @Override
    public int getPrice() {
        return 3;
    }
}
