package com.lee.designPattern.接口适配器模式.service;

public interface Interface1<I,O> {
    O adaptor1(I I);
    O adaptor2(I I);
    O adaptor3(I I);
    O adaptor4(I I);
}
