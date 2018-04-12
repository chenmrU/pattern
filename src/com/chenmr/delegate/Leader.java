package com.chenmr.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Chenmr on 2018/4/12/012.
 */
public class Leader {

    private static Map<String,Worker> workers = new HashMap<>();

    static{
        workers.put("A", new WorkerA());
        workers.put("B", new WorkerB());
    }

    public void doing(String name){
        workers.get(name).work();
    }

}
