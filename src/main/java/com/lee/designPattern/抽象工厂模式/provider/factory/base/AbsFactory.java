package com.lee.designPattern.抽象工厂模式.provider.factory.base;

import com.lee.designPattern.抽象工厂模式.provider.pizza.base.Pizza;

// 抽象工厂模式的底层抽象层
public interface AbsFactory {
     Pizza createPizza(String orderType);
}
