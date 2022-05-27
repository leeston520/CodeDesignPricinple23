package com.lee.designPattern.建造者模式.bean;

// 抽象建造者
public abstract class HouseBuilder {
    // 实例化空参，没传入属性
    protected House house = new House();

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void buildRoofed();

    // 返回实例
    public House build(){
        return house;
    }

}
