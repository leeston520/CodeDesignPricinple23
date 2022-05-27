package com.lee.designPrinciple;

// Liskov
public class 里氏替换原则 {
    public static void main(String[] args) {
        /*
         * 父类中已经实现好的方法，不要随意的重写
         * 可能会导致整个集成系统被破坏
         * 一句话： 引用基类的地方必须能透明地使用其子类的对象
         *         1. 不要重写父类方法
         *         2. 如果非要重写，那好，通过聚合、组合、依赖来解决问题
         *            比如： 将该方法提到更底层的父类里面
         */
        System.out.println("hello world");
    }
}

class Base{

    void BaseFunc(){

    }
}

class A extends Base{
    @Override
    void BaseFunc() {
        super.BaseFunc();
    }

    void aFunc(){

    }
}

// 采用组合调用A的方法
class B extends Base{
    @Override
    void BaseFunc() {
        super.BaseFunc();
    }

    private A a =  new A();

    void bFunc(){
        a.aFunc();

    }

}
