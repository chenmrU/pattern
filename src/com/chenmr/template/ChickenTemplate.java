package com.chenmr.template;

/**
 * 模板模式
 * Created by Chenmr on 2018/4/9/009.
 */
//使用自定义的方式制作鸡肉
public class ChickenTemplate {

    public void make(Mode mode){
        System.out.println("杀鸡，拔毛");
        System.out.println("洗干净鸡肉，准备食材");

        //烹饪方式
        System.out.println(mode.cooking());

        System.out.println("鸡肉做好了");
    }

}
