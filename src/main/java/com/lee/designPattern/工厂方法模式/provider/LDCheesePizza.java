package com.lee.designPattern.工厂方法模式.provider;

import com.lee.designPattern.工厂方法模式.provider.Base.Pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪");
        System.out.println("伦敦奶酪 .. preparing");
    }
}
