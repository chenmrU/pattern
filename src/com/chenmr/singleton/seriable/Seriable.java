package com.chenmr.singleton.seriable;

import java.io.Serializable;

/**
 * Created by Chenmr on 2018/4/7/007.
 */
public class Seriable implements Serializable{

    private Seriable(){}

    private static final Seriable INSTANCE = new Seriable();

    public static Seriable getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }

}
