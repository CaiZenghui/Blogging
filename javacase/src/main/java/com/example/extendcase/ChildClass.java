package com.example.extendcase;

/**
 * Created by caizenghui on 16/7/26.
 */
public class ChildClass extends BaseClass{
    public static int a = 100;
    private static ChildClass instance;

    public static ChildClass getInstance(){
        return instance;
    }

    public ChildClass() {
        instance = this;
        says();
        print();
    }

    public void print(){
        System.out.println("---------- ChildClass print ------------");
    }

    private void says(){
        System.out.println("---------- ChildClass says ------------");
    }
}
