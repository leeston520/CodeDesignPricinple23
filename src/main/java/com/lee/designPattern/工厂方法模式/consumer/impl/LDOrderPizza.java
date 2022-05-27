package com.lee.designPattern.工厂方法模式.consumer.impl;

import com.lee.designPattern.工厂方法模式.provider.Base.Pizza;
import com.lee.designPattern.工厂方法模式.provider.LDCheesePizza;
import com.lee.designPattern.工厂方法模式.provider.LDPepperPizza;
import com.lee.designPattern.工厂方法模式.consumer.OrderPizza;

// 专门负责London门店的
//
public class LDOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();

        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }else {
            System.out.println("本店没有 "+ orderType + " 的Pizza!");
            System.exit(-404);
        }
        return pizza;
    }
}
