package com.lee.designPattern.类适配器模式.app;

import com.lee.designPattern.类适配器模式.adaptor.VoltageAdaptor;

public class Client {
    public static void main(String[] args) {
        System.out.println("适配器模式");
        Phone phone = new Phone();
        phone.charging(new VoltageAdaptor(220));
    }
}
