package com.lee.designPrinciple;

// Dependence Inversion Principle
// 面向接口编程
public class 依赖倒转原则 {

    public static void main(String[] args) {


        /*
         * 细节依赖抽象的东西, 就是常用的 传入参数是 ? super T 输入对象时其实现类
         * 获得的结果也是实现类的结果，这样就能丰富接口的功能
         * 类似于父类的引用指向子类的对象
         * 接口所谓参数, 其可以传入所有的实现类
         * 接口作为缓冲层，面向接口编程
         * 抽象不应该依赖细节，而细节应该依赖抽象
         *
         */
    }
}
