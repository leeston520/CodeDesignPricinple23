package com.lee.designPattern.建造者模式.bean;

public class CommonHouse extends HouseBuilder {


    @Override
    public void buildBasic() {
        house.setBaise("普通房子地基");
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        house.setWall("普通房子砌墙");
        System.out.println("普通房子砌墙");
    }

    @Override
    public void buildRoofed() {
        house.setRoofed("普通房子屋顶");
        System.out.println("普通房子屋顶");
    }
}
