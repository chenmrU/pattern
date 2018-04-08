package com.chenmr.proxy.CglibProxy;

/**
 * Created by Chenmr on 2018/4/8/008.
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        try{
            Student student = ((Student)new PostOffice().getInstance(Student.class));
            student.sendPostcard();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
