package com.lee.designPrinciple;

public class 单一职责 {

    /**
     *  单一职责原则就是让一个类只负责一件事情
     */
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.runWater("海盗");
        vehicle.runRoad("三轮车");
        vehicle.runAir("海鸟");
    }
}


class Vehicle {

    // 地上
    public void runRoad(String name) {
        System.out.println(name + "地上跑");

    }

    // 空
    public void runAir(String name) {
        System.out.println(name + "空中行");

    }

    // 水
    public void runWater(String name) {
        System.out.println(name + "水上漂");

    }
}