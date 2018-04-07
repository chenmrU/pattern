package com.chenmr.singleton.lazy;

/**
 * 饿汉单例模式（非线程安全）
 * Created by Chenmr on 2018/4/7/007.
 */
public class Lazy {

    private Lazy(){};

    private static Lazy instance = null;

    public static Lazy getInstance(){
        if(instance==null){
            instance = new Lazy();
        }
        return instance;
    }

}
