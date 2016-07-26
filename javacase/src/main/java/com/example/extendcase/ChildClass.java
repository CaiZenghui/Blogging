package com.example.extendcase;

/**
 * Created by caizenghui on 16/7/26.
 */
public class ChildClass extends BaseClass{

    private static ChildClass instance;

    public static ChildClass getInstance(){
        return instance;
    }

    static {
        instance = new ChildClass();
    }

    public void print(){
        System.out.println("---------- ChildClass ------------");
    }
}
