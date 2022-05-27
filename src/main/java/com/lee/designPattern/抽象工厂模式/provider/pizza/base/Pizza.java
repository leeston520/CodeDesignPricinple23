package com.lee.designPattern.抽象工厂模式.provider.pizza.base;


public abstract class Pizza {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    // 调用该方法前一定要实例化 this.name
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
