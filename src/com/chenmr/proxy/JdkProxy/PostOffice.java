package com.chenmr.proxy.JdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Chenmr on 2018/4/7/007.
 */
public class PostOffice implements InvocationHandler{

    private Object target;

    public PostOffice(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("获取人员信息");
        method.invoke(target,args);
        System.out.println("包装明信片，然后寄出去");
        return null;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

}
