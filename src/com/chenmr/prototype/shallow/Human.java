package com.chenmr.prototype.shallow;

/**
 * 浅克隆
 * Created by Chenmr on 2018/4/7/007.
 */
public class Human implements Cloneable{

    private String name;

    private Head head;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    @Override
    public Human clone() throws CloneNotSupportedException {
        return (Human) super.clone();
    }
}
