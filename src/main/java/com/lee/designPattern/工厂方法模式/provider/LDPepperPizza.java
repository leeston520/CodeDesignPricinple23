package com.lee.designPattern.工厂方法模式.provider;

import com.lee.designPattern.工厂方法模式.provider.Base.Pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒");
        System.out.println("伦敦胡椒 .. preparing");
    }
}
