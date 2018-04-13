package com.chenmr.decorator;

public class Robot implements CarDecorator {

    private TransForm transForm;

    @Override
    public void say(){
        System.out.println("car say");
    }

    @Override
    public void move() {
        transForm.move();
    }
}
