package com.chenmr.singleton.hungry;

/**
 * 懒汉单例模式
 * Created by chenmr on 2018/4/7/007.
 */
public class Hungry {

    private Hungry(){};

    private static final Hungry instance = new Hungry();

    public static Hungry getInstance(){
        return instance;
    }

}
