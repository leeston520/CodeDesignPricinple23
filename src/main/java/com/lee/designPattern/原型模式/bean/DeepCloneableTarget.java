package com.lee.designPattern.原型模式.bean;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    String cloneName;
    String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }


    // 因为属性是基本数据类型 所以使用默认克隆就行
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
