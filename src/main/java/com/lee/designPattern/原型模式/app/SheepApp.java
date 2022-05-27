package com.lee.designPattern.原型模式.app;

import com.lee.designPattern.原型模式.bean.Sheep;

public class SheepApp {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("Tolly", 1, "white");
        Sheep clone = sheep.clone();

        System.out.println(clone);

        System.out.println(sheep.hashCode() + "\t" + clone.hashCode());


    }
}
