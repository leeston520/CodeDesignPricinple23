package com.lee.designPattern.单例;

public class 单例模式 {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        Singleton2 instance2 = Singleton2.getInstance();
        Singleton2 instance3 = Singleton2.getInstance();

        System.out.println(instance2 == instance3);

        Singleton7 instance4 = Singleton7.INSTANCE;

        instance4.hello();

    }
}

// 饿汉式-静态常量
// 通过classloader 机制避免了多线程同步问题 但是浪费一些内存资源

class Singleton {

    // 构造器私有化,  不允许 new 对象
    private Singleton() {
    }

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}

// 饿汉式-静态代码块

class Singleton2 {

    // 构造器私有化,  不允许 new 对象
    private Singleton2() {}
    // 静态代码块创建单例对象
    static {
        instance2 = new Singleton2();
    }

    private static Singleton2 instance2;

    public static Singleton2 getInstance() {
        return instance2;
    }
}

// 线程不安全的懒汉式
class Singleton3{

    private static Singleton3 instance;


    private Singleton3(){}

    // 懒汉式，会有线程安全问题
    public static Singleton3 getInstance(){
        if(instance==null){

            instance = new Singleton3();
        }
        return instance;
    }
}

class Singleton4{
    private static Singleton4 instance;
    private Singleton4(){}
    // 懒汉式，会有线程安全问题
    public static synchronized Singleton4 getInstance(){

            if(instance==null){

                instance = new Singleton4();
            }
            return instance;
        }
}

// 双检锁保证线程安全
class Singleton5{
    private static Singleton5 instance;
    private Singleton5(){}
    // 懒汉式，会有线程安全问题
    public static Singleton5 getInstance(){
        if(instance==null){
            synchronized (Singleton5.class){
                // 再次判断
                if(instance == null){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}

// 通过静态内部类加载单利模式
// jvm 加载类的时候是线程安全的
class Singleton6{
    private static volatile Singleton6 instance;
    private Singleton6(){}
    // 懒汉式, 会有线程安全问题
    private static class SingletonInstance{
        private static final Singleton6 INSTANCE = new Singleton6();
    }
    public static synchronized Singleton6 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}



enum Singleton7{

    INSTANCE;

    public void hello(){
        System.out.println("````HELLO````");
    }

}