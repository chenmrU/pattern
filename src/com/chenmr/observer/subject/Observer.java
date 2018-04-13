package com.chenmr.observer.subject;

import com.chenmr.observer.core.Event;

/**
 * 观察者
 * Created by Chenmr on 2018/4/13/013.
 */
public class Observer {

    public void advice(Event e){
        System.out.println("=====触发======\n"+ e);
    }

}
