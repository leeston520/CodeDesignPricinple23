package com.lee.designPattern.建造者模式.app;

import com.lee.designPattern.建造者模式.bean.CommonHouse;
import com.lee.designPattern.建造者模式.bean.HighBuilding;
import com.lee.designPattern.建造者模式.product.HouseDirector;

public class D2 {

    public static void main(String[] args) {
       // 普通房子
        new HouseDirector(new CommonHouse()).constructHouse();
        // 高楼
        System.out.println("----------------------------------------------------");
        new HouseDirector(new HighBuilding()).constructHouse();

        // JdbcConnectionOptions
    }
}
