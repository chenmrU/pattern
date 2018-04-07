package com.chenmr.singleton;

import com.chenmr.singleton.lazy.LazyInner;

import java.lang.reflect.Constructor;

/**
 * Created by Chenmr on 2018/4/7/007.
 */
public class SingletonReflectTest {

    public static void main(String[] args) {

        Class clazz = LazyInner.class;

        try {
            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            LazyInner lazyInner = (LazyInner) constructor.newInstance();
            LazyInner lazyInner1 = (LazyInner) constructor.newInstance();
            System.out.println(lazyInner);
            System.out.println(lazyInner1);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
