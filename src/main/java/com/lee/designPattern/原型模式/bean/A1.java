package com.lee.designPattern.原型模式.bean;

public class A1 implements Cloneable {
    String name;

    public A1(String name) {
        this.name = name;
    }

    public A1() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


class App{

    public static void main(String[] args) {
        A1 lee = new A1("lee");
    }
}