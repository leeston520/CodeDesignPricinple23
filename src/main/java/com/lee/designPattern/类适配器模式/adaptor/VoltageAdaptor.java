package com.lee.designPattern.类适配器模式.adaptor;

import com.lee.designPattern.类适配器模式.service.V5V;

// 适配器类
public class VoltageAdaptor extends V220V implements V5V {
    public int inputV;

    public VoltageAdaptor(int inputV) {
        this.inputV = inputV;
    }

    @Override
    public int output5V() {
        // 获取输入的值为220
        return (int) inputV/44;
    }
}
