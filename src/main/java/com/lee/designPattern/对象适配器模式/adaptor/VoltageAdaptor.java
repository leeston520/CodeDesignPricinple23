package com.lee.designPattern.对象适配器模式.adaptor;

import com.lee.designPattern.对象适配器模式.service.V5V;

// 具体的输出
public class VoltageAdaptor implements V5V {
    private V220V v220V;

    // 构造器传入220V
    public VoltageAdaptor(V220V v220V) {
        this.v220V = v220V;
    }


    // 输出的是5V
    @Override
    public int output5V() {
        int res = 0;
        if(null!=v220V){
            // 通过对象调用
            int src = v220V.output220V();
            System.out.println(src + " 正在适配" );
            res = src/44;
            System.out.println("输出电压: "+ res);
        }
        return res;
    }
}
