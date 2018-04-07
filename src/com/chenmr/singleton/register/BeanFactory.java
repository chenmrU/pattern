package com.chenmr.singleton.register;

import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Chenmr on 2018/4/7/007.
 */
public class BeanFactory {
    private BeanFactory(){};

    private static Map<String,Object> map = new ConcurrentHashMap<String,Object>();

    public static Object getBean(String beanName){
        if(beanName.isEmpty()){
            throw new RuntimeException("beanName is null");
        }

        if(!map.containsKey(beanName)){
            try {
                Class clazz = Class.forName(beanName);
                Constructor constructor = clazz.getDeclaredConstructor();
                constructor.setAccessible(true);
                map.put(beanName,constructor.newInstance());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return map.get(beanName);
    }

}
