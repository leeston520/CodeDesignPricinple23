package com.lee.designPattern.工厂方法模式.consumer;

import com.lee.designPattern.工厂方法模式.provider.Base.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    // 将createPizza 抽象出去,让子类实现, 聪明啊
   public abstract Pizza createPizza(String orderType);

    // orderPizza相当于消费者
    public OrderPizza(){
        // pizza相当于圣餐这
        Pizza pizza = null;
        String orderType = null;

        do{
            orderType = getType();
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);

    }
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
