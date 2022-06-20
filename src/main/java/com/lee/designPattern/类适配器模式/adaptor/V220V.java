package com.lee.designPattern.类适配器模式.adaptor;

public class V220V {

    public int output220V(){
        int src = 220;
        System.out.println("电压 = "+220+" 伏");
        return src;
    }
}
