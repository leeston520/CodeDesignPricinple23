package com.lee.designPattern.建造者模式.bean;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼房子打地基100m^2");
    }

    @Override
    public void buildWalls() {

        System.out.println("高楼房子砌墙 200m");
    }

    @Override
    public void buildRoofed() {
        System.out.println("高楼房子屋顶 120m^2");
    }
}
