package com.lee.designPattern.简单工厂模式;


public class Pizza {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void prepare() {

        System.out.println(this.name + " preparing...");

    }

    public void bake() {
        System.out.println(this.name + " baking...");
    }

    public void cut() {
        System.out.println(this.name + " cutting...");
    }

    public void box() {
        System.out.println(this.name + " boxing...");
    }
}






