package com.lee.designPattern.原型模式.bean;

import java.io.*;
import java.util.HashMap;

public class DeepProtoType implements Serializable, Cloneable {

    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
    }

    /**
     * 第一种方法实现深拷贝克隆
     * 1. 先拷贝基本数据类型
     * 2. 再拷贝自定义类型
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 先处理基本数据类型
        Object deep = super.clone();
        // 准备处理自定义对象类型
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        // 再处理 deepCloneableTarget 这种类型
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        // 返回
        return deepProtoType;
    }

    // 深拷贝- 方式2 - 通过对象的序列化实现深拷贝（推荐使用）
    // 利用
    public Object deepClone() {
        //
        ByteArrayOutputStream bos = null;

        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 将当前对象以对象流的方式输出
            oos.writeObject(this);

            // 反序列化
            // 将输出对象再读进来，就相当于克隆
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyType = (DeepProtoType) ois.readObject();
            return copyType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }finally {

            try {
                assert oos != null;
                oos.close();
                bos.close();
                assert ois != null;
                ois.close();
                bis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
