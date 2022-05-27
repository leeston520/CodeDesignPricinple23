package com.lee.designPattern.简单工厂模式;

public class PizzaStore {

    public static void main(String[] args) {
        // 直接在OrderPizza构造器阶段进行设置pizza种类,判断并获得用户输入
        // 再SimpleFactory 里面进行判断,获得想要的种类
        new OrderPizza(new SimpleFactory());
        System.out.println("程序退出");
    }
}
