package com.lee.designPrinciple;

/*
 * Open Close Principle
 */
public class 开闭原则 {


    public static void main(String[] args) {

        /*
         * 最基础 最重要的程序设计原则
         */

        Circle circle = new Circle();
        circle.draw(1);

        Rectangle rectangle = new Rectangle();
        rectangle.draw(3123);




    }
}

// 将画图父类抽象起来 让子类实现
interface Shape<I,O>{
   O draw( I i);
}

class Circle implements Shape<
        Integer,String >{


    @Override
    public String draw(Integer I) {
        System.out.println("没事儿画个圆");
        return null;
    }
}

class Rectangle implements Shape<Object,String>{

    @Override
    public String draw(Object I) {
        System.out.println("没事画个三角形");
        return null;
    }
}

interface BIO{
}