package com.chenmr.proxy.staticProxy;

/**
 * 邮政帮人寄明信片
 * Created by Chenmr on 2018/4/7/007.
 */
public class PostOffice {

    private Person person;

    public PostOffice(Person person){
        this.person = person;
    }

    public void sendPostcard(){
        System.out.println("获取人员信息");
        person.sendPostcard();
        System.out.println("包装明信片，然后寄出去");
    }

}
