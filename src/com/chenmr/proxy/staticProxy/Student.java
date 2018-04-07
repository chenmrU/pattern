package com.chenmr.proxy.staticProxy;

/**
 * 学生
 * Created by Chenmr on 2018/4/7/007.
 */
public class Student implements Person {

    @Override
    public void sendPostcard() {
        System.out.println("学生将明信片交给邮政");
    }
}
