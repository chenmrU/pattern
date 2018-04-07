package com.chenmr.singleton;

import com.chenmr.singleton.lazy.Lazy;
import com.chenmr.singleton.register.BeanFactory;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Chenmr on 2018/4/7/007.
 */
public class SingletonThreadSafeTest {

    public static void main(String[] args) {

        int count = 20;

        CountDownLatch latch = new CountDownLatch(count);

        long start = System.currentTimeMillis();
        for(int i=0; i<count; i++){
            new Thread(){
                @Override
                public void run(){
                    try{

                        try{
                            latch.await();
                        }catch (Exception e){
                            e.printStackTrace();
                        }

                        BeanFactory beanFactory = (BeanFactory) BeanFactory.getBean("com.chenmr.singleton.register.BeanFactory");
                        System.out.println(System.currentTimeMillis()+":"+beanFactory);

                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            }.start();
            latch.countDown();
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时："+(end-start));
    }

}
