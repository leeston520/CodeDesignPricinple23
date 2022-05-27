package com.lee.designPattern.抽象工厂模式.provider.pizza.impl;


import com.lee.designPattern.抽象工厂模式.provider.pizza.base.Pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪");
        System.out.println("伦敦奶酪 .. preparing");
    }
}
