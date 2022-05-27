package com.lee.designPattern.建造者模式.product;

import com.lee.designPattern.建造者模式.bean.House;
import com.lee.designPattern.建造者模式.bean.HouseBuilder;

public class HouseDirector {
    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 具体建造流程，交给指挥者
    public House constructHouse(){
        // 流程你来说
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.buildRoofed();
        houseBuilder.build();

        return houseBuilder.build();

    }

}
