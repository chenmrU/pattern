package com.chenmr.delegate;

/**
 * Created by Chenmr on 2018/4/12/012.
 */
public class WorkerB implements Worker{
    @Override
    public void work() {
        System.out.println("B工作");
    }
}
