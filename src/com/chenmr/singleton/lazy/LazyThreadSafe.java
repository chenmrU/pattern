package com.chenmr.singleton.lazy;

/**
 * 懒汉模式（线程安全）
 * Created by Chenmr on 2018/4/7/007.
 */
public class LazyThreadSafe {
    private LazyThreadSafe(){};

    private static LazyThreadSafe instance;

    public synchronized LazyThreadSafe getInstance(){
        if(instance==null){
            instance = new LazyThreadSafe();
        }
        return instance;
    }

}
