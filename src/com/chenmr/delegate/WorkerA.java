package com.chenmr.delegate;

/**
 * Created by Chenmr on 2018/4/12/012.
 */
public class WorkerA implements Worker{


    @Override
    public void work() {
        System.out.println("A工作");
    }
}
