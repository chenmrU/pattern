package com.chenmr.prototype;

import com.chenmr.prototype.shallow.Head;
import com.chenmr.prototype.shallow.Human;

/**
 * Created by Chenmr on 2018/4/7/007.
 */
public class ShallowPrototypeTest {

    public static void main(String[] args) {

        Human human = new Human();
        human.setName("origin");
        Head head = new Head();
        head.setColor("red");
        human.setHead(head);

        System.out.println(human.getHead());

        try {
            Human man = human.clone();
            System.out.println(man.getHead());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
