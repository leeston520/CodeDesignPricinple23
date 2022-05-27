package com.lee.designPattern.简单工厂模式;

// 简单工厂类
public class SimpleFactory {
    // 根据orderType 返回对应的order 对象
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊pizza");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪pizza");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒pizza");
        }
        System.out.println("使用简单工厂模式");
        return pizza;
    }
}
