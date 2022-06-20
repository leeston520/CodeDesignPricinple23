package com.lee.designPattern.接口适配器模式.app;

import com.lee.designPattern.接口适配器模式.adaptor.InterfaceAbsClassImpl;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        Integer res = new InterfaceAbsClassImpl<Integer, Integer>() {
            @Override
            public Integer adaptor1(Integer I) {
                return I / 44;
            }
        }.adaptor1(220);

        System.out.println("适配输出为: "+ res);
    }
}
