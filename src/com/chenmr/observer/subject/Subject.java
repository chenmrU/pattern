package com.chenmr.observer.subject;

import com.chenmr.observer.core.EventListener;

/**
 * 被观察
 * Created by Chenmr on 2018/4/13/013.
 */
public class Subject extends EventListener{

    public void add() throws Exception {
        System.out.println("add");
        trigger(SubjectEventType.ON_ADD);
    }

    public void remove() throws Exception{
        System.out.println("remove");
        trigger(SubjectEventType.ON_REMOVE);
    }
}
