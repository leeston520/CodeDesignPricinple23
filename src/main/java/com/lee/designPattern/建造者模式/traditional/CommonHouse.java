package com.lee.designPattern.建造者模式.traditional;


import com.sun.istack.internal.Nullable;

import java.util.Optional;

// 现实中最常用的建造者模式, 一个类解决问题
// 使用 @Nullable 来避免构造器创建对象时的 空指针异常
// 使用 Optional.ofNullable 来避免获取属性时的空指针异常
public  class CommonHouse {
    // 定义属性
    @Nullable protected final String baseAttr;
    @Nullable protected final  String wallsAttr;
    @Nullable protected final  String roofAttr;


    protected CommonHouse(String baseAttr, String wallsAttr, String roofAttr) {
        this.baseAttr = baseAttr;
        this.wallsAttr = wallsAttr;
        this.roofAttr = roofAttr;
    }

    // 定义 get方法即可
    public Optional<String> getBaseAttr() {
        return Optional.ofNullable(baseAttr);
    }

    public Optional<String> getWallsAttr() {
        return Optional.ofNullable(wallsAttr);
    }

    public Optional<String> getRoofAttr() {
        return Optional.ofNullable(roofAttr);
    }

    @Override
    public String toString() {
        return "CommonHouse{" +
                "baseAttr='" + baseAttr + '\'' +
                ", wallsAttr='" + wallsAttr + '\'' +
                ", roofAttr='" + roofAttr + '\'' +
                '}';
    }

    public static class CommonHouseBuilder{
        private String baseAttr;
        private String wallsAttr;
        private String roofAttr;

        public CommonHouseBuilder addBase(String baseAttr){
            this.baseAttr = baseAttr;
            return this;

        }
        public CommonHouseBuilder addWalls(String wallsAttr){

            this.wallsAttr = wallsAttr;
            return this;
        }

        public CommonHouseBuilder addRoofAttr(String roofAttr){
            this.roofAttr = roofAttr;
            return this;
        }

        public CommonHouse build(){

            return new CommonHouse(baseAttr,wallsAttr,roofAttr);
        }

    }

}
