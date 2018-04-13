package com.chenmr.observer.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 事件监听器
 * Created by Chenmr on 2018/4/13/013.
 */
public class EventListener {

    protected Map<Enum, Event> events = new HashMap<>();

    public void addListener(Enum eventType, Object target, Method callback){
        events.put(eventType,new Event(target,callback));
    }

    private void trigger(Event e) throws Exception {
        e.setSource(this);
        e.setTime(System.currentTimeMillis());
        e.getCallback().invoke(e.getTarget(),e);
    }

    protected void trigger(Enum call) throws Exception {
        if(!this.events.containsKey(call)) return;
        trigger(this.events.get(call).setTrigger(call.toString()));
    }

}
