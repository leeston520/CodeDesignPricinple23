package com.lee.designPattern.工厂方法模式.provider;

import com.lee.designPattern.工厂方法模式.provider.Base.Pizza;

// 工厂方法模式是对于各种类型的细分,
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京奶酪...");
        System.out.println("北京奶酪 .. preparing");
    }

}
