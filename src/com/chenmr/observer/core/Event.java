package com.chenmr.observer.core;

import java.lang.reflect.Method;

/**
 * 事件
 * Created by Chenmr on 2018/4/13/013.
 */
public class Event {

    //事件源
    private Object source;

    //通知目标
    private Object target;

    //回调
    private Method callback;

    //时间
    private Long time;

    public Long getTime() {
        return time;
    }

    public Event setTime(Long time) {
        this.time = time;
        return this;
    }

    //触发
    private String trigger;

    public Event(Object target, Method callback){
        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public Object getTarget() {
        return target;
    }

    public Event setTarget(Object target) {
        this.target = target;
        return this;
    }

    public Method getCallback() {
        return callback;
    }

    public Event setCallback(Method callback) {
        this.callback = callback;
        return this;
    }

    public String getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    @Override
    public String toString() {
        return "Event{" +
                 "\n\tsource=" + source + ",\n" +
                 "\n\ttarget=" + target + ",\n" +
                 "\n\tcallback=" + callback + ",\n" +
                 "\n\ttriger=" + trigger + ",\n";
    }
}
