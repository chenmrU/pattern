package com.chenmr.decorator;

public class Car implements TransForm{

    @Override
    public void move() {
        System.out.println("car move");
    }
}
