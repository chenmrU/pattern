package com.chenmr.template;

/**
 * Created by Chenmr on 2018/4/9/009.
 */
public class TemplateTest {

    public static void main(String[] args) {

        ChickenTemplate chickenTemplate = new ChickenTemplate();
        chickenTemplate.make(new Mode() {
            @Override
            public String cooking() {
                return "炖鸡肉";
            }
        });

    }

}
