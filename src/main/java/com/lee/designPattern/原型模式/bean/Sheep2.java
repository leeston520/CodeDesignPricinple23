package com.lee.designPattern.原型模式.bean;

public class Sheep2 implements Cloneable{
    private String name;
    private int age;
    private String color;
    private Sheep friend;

    public Sheep2(String name, int age, String color,Sheep friend) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.friend = friend;
    }

    public Sheep2() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", friend=" + friend +
                '}';
    }



// 重写克隆方法,默认克隆

    @Override
    public Sheep2 clone() throws CloneNotSupportedException {

        Sheep2 sheep = null;
        try{
            sheep = (Sheep2)super.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
