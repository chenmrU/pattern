package com.chenmr.prototype.deep;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * Created by Chenmr on 2018/4/7/007.
 */
public class Cpu implements Serializable, Cloneable{

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    protected Cpu clone() throws CloneNotSupportedException {
        try {
            Class clazz = this.getClass();
            Cpu cpu = new Cpu();
            Field[] fields = clazz.getDeclaredFields();
            for(Field field : fields){
                field.set(cpu,field.get(this));
            }
            return cpu;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
