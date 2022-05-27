package com.lee.designPattern.抽象工厂模式.provider.pizza.impl;


import com.lee.designPattern.抽象工厂模式.provider.pizza.base.Pizza;

// 工厂方法模式是对于各种类型的细分,
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京奶酪...");
        System.out.println("北京奶酪 .. preparing");
    }

}
