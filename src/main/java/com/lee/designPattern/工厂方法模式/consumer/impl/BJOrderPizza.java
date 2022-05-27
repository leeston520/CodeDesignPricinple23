package com.lee.designPattern.工厂方法模式.consumer.impl;


import com.lee.designPattern.工厂方法模式.provider.BJCheesePizza;
import com.lee.designPattern.工厂方法模式.provider.BJPepperPizza;
import com.lee.designPattern.工厂方法模式.provider.Base.Pizza;
import com.lee.designPattern.工厂方法模式.consumer.OrderPizza;

// 专门实现createPizza的功能,，再 orderPizza上一层， 具体pizza的下一层
// abstract 抽象类的抽象方法也是implement
// 相当于更细化了，北京的 只看北京的 CheesePizza 或者 Pepper 披萨
public class BJOrderPizza extends OrderPizza {

    Pizza pizza = null;
    @Override
    public Pizza createPizza(String orderType) {
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();

        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }else {
            System.out.println("本店没有 "+ orderType + " 的Pizza!");
            System.exit(-404);
        }
        return pizza;
    }
}
