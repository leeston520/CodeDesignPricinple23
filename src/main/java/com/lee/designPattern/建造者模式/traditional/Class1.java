package com.lee.designPattern.建造者模式.traditional;

import com.sun.istack.internal.Nullable;

public class Class1 {
    @Nullable String name;
    @Nullable Integer age;

    public Class1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
