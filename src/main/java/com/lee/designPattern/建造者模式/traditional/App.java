package com.lee.designPattern.建造者模式.traditional;

public class App {
    public static void main(String[] args) {

        CommonHouse.CommonHouseBuilder commonHouseBuilder = new CommonHouse.CommonHouseBuilder()
                 .addWalls("添加墙壁")
                // .addBase("基础设置")
                 .addRoofAttr("添加顶砖");
        CommonHouse commonHouse = commonHouseBuilder.build();
        System.out.println(commonHouse);

        System.out.println("---------------------------------");

        String name=null;
        Integer age=null;
        Class1 class1 = new Class1(name, age);
        System.out.println(class1);

    }
}
