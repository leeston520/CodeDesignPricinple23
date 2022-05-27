package com.lee.designPattern.抽象工厂模式.provider.factory.impl;

import com.lee.designPattern.抽象工厂模式.provider.factory.base.AbsFactory;
import com.lee.designPattern.抽象工厂模式.provider.pizza.base.Pizza;
import com.lee.designPattern.抽象工厂模式.provider.pizza.impl.LDCheesePizza;
import com.lee.designPattern.抽象工厂模式.provider.pizza.impl.LDPepperPizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza =  new LDPepperPizza();
        }
        return pizza;
    }
}
