package com.chenmr.proxy.JdkProxy;

/**
 * 动态代理测试类
 * Created by Chenmr on 2018/4/7/007.
 */
public class JdkProxyTest {

    public static void main(String[] args) {

        Student student = new Student();
        PostOffice postOffice = new PostOffice(student);
        Person person = (Person) postOffice.getProxy();
        person.sendPostcard();
    }

}
