package com.lee.designPattern.抽象工厂模式.provider.factory.impl;

import com.lee.designPattern.抽象工厂模式.provider.factory.base.AbsFactory;
import com.lee.designPattern.抽象工厂模式.provider.pizza.base.Pizza;
import com.lee.designPattern.抽象工厂模式.provider.pizza.impl.NewYorkCheesePizza;
import com.lee.designPattern.抽象工厂模式.provider.pizza.impl.NewYorkPepperPizza;

public class NewYorkFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new NewYorkCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza =  new NewYorkPepperPizza();
        }
        return pizza;
    }
}
