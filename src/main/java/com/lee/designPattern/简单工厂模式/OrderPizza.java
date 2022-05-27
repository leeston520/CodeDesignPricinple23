package com.lee.designPattern.简单工厂模式;

import java.io.*;

public class OrderPizza {
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    // 主要是创建OrderPizza对象的时候, 进行判断
    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    private void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = "";
        // 传入工厂对象
        this.simpleFactory = simpleFactory;
    do {
        orderType = getType();
        pizza = this.simpleFactory.createPizza(orderType);
        //

        if(this.pizza != null){
            this.pizza.prepare();
            this.pizza.bake();
            this.pizza.cut();
            this.pizza.box();
        }else {
            System.out.println("订购失败");
            break;
        }
    }while (true);
    }

    // 本地输入pizza类型
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
