package com.lee.designPattern.工厂方法模式.provider;

import com.lee.designPattern.工厂方法模式.provider.Base.Pizza;

public class NewYorkPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("纽约胡椒");
        System.out.println("纽约胡椒 .. preparing");
    }
}
