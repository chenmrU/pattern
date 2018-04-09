package com.chenmr.strategy;

import com.chenmr.strategy.way.Travel;

/**
 * Created by Chenmr on 2018/4/9/009.
 */
public class ToTravel {

    public void goTravel(TravelEnum travelEnum){
        System.out.println("准备去旅游");
        travelEnum.getTravel().vehicle();
        System.out.println("到达目的地");
    }

}
