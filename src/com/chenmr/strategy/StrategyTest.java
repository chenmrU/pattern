package com.chenmr.strategy;

import com.chenmr.strategy.way.Travel;

/**
 * 策略模式
 * Created by Chenmr on 2018/4/9/009.
 */
public class StrategyTest {

    public static void main(String[] args) {
        ToTravel toTravel = new ToTravel();
        toTravel.goTravel(TravelEnum.Boat);
    }

}
