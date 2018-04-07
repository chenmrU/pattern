package com.chenmr.proxy.staticProxy;

/**
 * 静态代理测试类
 * Created by Chenmr on 2018/4/7/007.
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        Person sudent = new Student();
        PostOffice postOffice = new PostOffice(sudent);
        postOffice.sendPostcard();
    }

}
