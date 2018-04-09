package com.chenmr.strategy;

import com.chenmr.strategy.way.Boat;
import com.chenmr.strategy.way.Plane;
import com.chenmr.strategy.way.Travel;

/**
 * Created by Chenmr on 2018/4/9/009.
 */
public enum TravelEnum {

    Boat(new Boat()),
    Plane(new Plane());

    private Travel travel;

    TravelEnum(Travel travel){
        this.travel = travel;
    }

    public Travel getTravel(){
        return travel;
    }

}
