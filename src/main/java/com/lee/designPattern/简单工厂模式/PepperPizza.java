package com.lee.designPattern.简单工厂模式;

public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("pepper pizza prepare" );
    }
}
