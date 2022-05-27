package com.lee.designPattern.原型模式.app;

import com.lee.designPattern.原型模式.bean.Sheep;
import com.lee.designPattern.原型模式.bean.Sheep2;

public class SheepApp2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep2 sheep2 = new Sheep2("name1", 18, "white", new Sheep("name2", 19, "black"));

        Sheep2 sheep3 = sheep2.clone();
        System.out.println(sheep2.getFriend());
        System.out.println(sheep3.getFriend());
        // 说明原型模式对类的类成员属性是无效的, 只对当前类对象有效
        System.out.println(sheep2.getFriend().equals(sheep3.getFriend()));

    }
}
