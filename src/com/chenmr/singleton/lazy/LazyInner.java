package com.chenmr.singleton.lazy;

import java.io.Serializable;

/**
 * 懒汉模式（内部类）
 * Created by Chenmr on 2018/4/7/007.
 */
public class LazyInner{

    private LazyInner(){};

    public static LazyInner getInstance(){
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder{
        private static final LazyInner INSTANCE = new LazyInner();
    }

}
