package com.lee.designPattern.抽象工厂模式.provider.pizza.impl;


import com.lee.designPattern.抽象工厂模式.provider.pizza.base.Pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒");
        System.out.println("伦敦胡椒 .. preparing");
    }
}
