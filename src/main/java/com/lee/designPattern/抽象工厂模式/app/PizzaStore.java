package com.lee.designPattern.抽象工厂模式.app;

import com.lee.designPattern.抽象工厂模式.consumer.OrderPizza;
import com.lee.designPattern.抽象工厂模式.provider.factory.impl.BJFactory;

public class PizzaStore {
    public static void main(String[] args) {
        System.out.println("使用抽象工厂模式");
        // 订购北京的pizza
        new OrderPizza(new BJFactory());
    }
}
