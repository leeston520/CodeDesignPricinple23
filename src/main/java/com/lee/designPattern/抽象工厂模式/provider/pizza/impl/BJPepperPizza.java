package com.lee.designPattern.抽象工厂模式.provider.pizza.impl;


import com.lee.designPattern.抽象工厂模式.provider.pizza.base.Pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒");
        System.out.println("北京胡椒 .. preparing");
    }
}
