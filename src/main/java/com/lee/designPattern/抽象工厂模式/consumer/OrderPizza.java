package com.lee.designPattern.抽象工厂模式.consumer;

import com.lee.designPattern.抽象工厂模式.provider.factory.base.AbsFactory;
import com.lee.designPattern.抽象工厂模式.provider.pizza.base.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    AbsFactory absFactory = null;

    public OrderPizza(AbsFactory subFac) {
        setAbsFactory(subFac);
    }

    private void setAbsFactory(AbsFactory subFactory) {
        this.absFactory = subFactory;
        Pizza pizza = null;
        String orderType = null;
        do{
            orderType = getType();
            // 传入的 absFactory 可能是伦敦的 也可能是北京
            // 子类实现中需要setName 否则为null
            pizza = subFactory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败！");
                break;
            }

        }while (true);


    }


    // 获得用户输入的类型
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            return strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
