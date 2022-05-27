package com.lee.designPattern.抽象工厂模式.provider.factory.impl;

import com.lee.designPattern.抽象工厂模式.provider.factory.base.AbsFactory;
import com.lee.designPattern.抽象工厂模式.provider.pizza.base.Pizza;
import com.lee.designPattern.抽象工厂模式.provider.pizza.impl.BJCheesePizza;
import com.lee.designPattern.抽象工厂模式.provider.pizza.impl.BJPepperPizza;


// 工厂子类
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza =  new BJPepperPizza();
        }
        return pizza;
    }
}
