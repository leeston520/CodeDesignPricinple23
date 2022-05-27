package com.lee.designPattern.工厂方法模式.consumer.impl;

import com.lee.designPattern.工厂方法模式.provider.Base.Pizza;
import com.lee.designPattern.工厂方法模式.provider.NewYorkCheesePizza;
import com.lee.designPattern.工厂方法模式.provider.NewYorkPepperPizza;
import com.lee.designPattern.工厂方法模式.consumer.OrderPizza;

public class NewYorkOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new NewYorkCheesePizza();

        }else if(orderType.equals("pepper")){
            pizza = new NewYorkPepperPizza();
        }else {
            System.out.println("本店没有 "+ orderType + " 的Pizza!");
            System.exit(-404);
        }
        return pizza;
    }
}
