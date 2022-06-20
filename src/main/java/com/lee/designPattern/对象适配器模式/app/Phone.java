package com.lee.designPattern.对象适配器模式.app;

import com.lee.designPattern.对象适配器模式.service.V5V;

public class Phone {
    // 等于是防御式编程，检验子类适配结果
    public void charging(V5V v5V){
        if(v5V.output5V() ==5){
            System.out.println("为5V 可以充电");
        }else if(v5V.output5V() > 5){
            System.out.println("大于5V，没法充电");
        }else {
            System.out.println("未知错误");
        }
    }
}
