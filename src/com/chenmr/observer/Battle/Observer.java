package com.chenmr.observer.Battle;

//抽象观察者
public interface Observer {
    String getName();
    void setName(String name);
    void help();//声明支援盟友方法
    void beAttacked(AllyControlCenter acc);//声明遭受攻击方法
}
