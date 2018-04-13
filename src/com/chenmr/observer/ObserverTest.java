package com.chenmr.observer;

import com.chenmr.observer.core.Event;
import com.chenmr.observer.subject.Observer;
import com.chenmr.observer.subject.Subject;
import com.chenmr.observer.subject.SubjectEventType;

import java.lang.reflect.Method;

/**
 * Created by Chenmr on 2018/4/14/014.
 */
public class ObserverTest {

    public static void main(String[] args) {
        try{

            Observer observer = new Observer();
            Method advice = Observer.class.getMethod("advice", new Class<?>[]{Event.class});

            Subject subject = new Subject();
            subject.addListener(SubjectEventType.ON_ADD,observer,advice);

            subject.add();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
