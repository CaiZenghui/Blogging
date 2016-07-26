package com.example.extendcase;

/**
 * Created by caizenghui on 16/7/26.
 */
public class ChildClass extends BaseClass{

    private static ChildClass instance;

    public static ChildClass getInstance(){
        return instance;
    }

    public ChildClass() {
        instance = this;
    }

    public void print(){
        System.out.println("---------- ChildClass ------------");
    }
}
