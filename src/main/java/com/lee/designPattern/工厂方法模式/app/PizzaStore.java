package com.lee.designPattern.工厂方法模式.app;

import com.lee.designPattern.工厂方法模式.consumer.impl.NewYorkOrderPizza;

// orderPizza 相当于消费者 ,XXCheesePizza 或者 XXPepperPizza 相当于生产者
public class PizzaStore {
    public static void main(String[] args) {
        // new BJOrderPizza();
        // new LDOrderPizza();
        new NewYorkOrderPizza();
    }
}
