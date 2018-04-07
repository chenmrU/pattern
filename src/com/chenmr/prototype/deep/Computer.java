package com.chenmr.prototype.deep;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 深克隆
 * Created by Chenmr on 2018/4/7/007.
 */
public class Computer implements Cloneable, Serializable{

    private String brand;
    private Cpu cpu;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public Computer clone() throws CloneNotSupportedException {
        //序列化
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return (Computer) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        //反射
        /*try {
            Computer computer = new Computer();

            Class<?> clazz = this.getClass();
            Field[] fields = clazz.getDeclaredFields();
            for(Field field: fields){
                if(field.get(this) instanceof Cloneable){
                    Method method = field.get(this).getClass().getDeclaredMethod("clone");
                    field.set(computer,method.invoke(field.get(this)));
                }else{
                    field.setAccessible(true);
                    field.set(computer,field.get(this));
                }
            }

            return computer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }*/
    }
}
