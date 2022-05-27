package com.lee.designPattern.抽象工厂模式.provider.pizza.impl;


import com.lee.designPattern.抽象工厂模式.provider.pizza.base.Pizza;

public class NewYorkPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("纽约胡椒");
        System.out.println("纽约胡椒 .. preparing");
    }
}
