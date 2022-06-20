package com.lee.designPattern.接口适配器模式.adaptor;

import com.lee.designPattern.接口适配器模式.service.Interface1;

public  class InterfaceAbsClassImpl<I,O> implements Interface1<I, O> {


    @Override
    public O adaptor1(I I) {
        return null;
    }

    @Override
    public O adaptor2(I I) {
        return null;
    }

    @Override
    public O adaptor3(I I) {
        return null;
    }

    @Override
    public O adaptor4(I I) {
        return null;
    }
}
