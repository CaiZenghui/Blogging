package com.example.extendcase;

/**
 * Created by caizenghui on 16/7/26.
 */
public class BaseClass {

    private static BaseClass instance;

    public static BaseClass getInstance(){
        return instance;
    }

    static {
        instance = new BaseClass();
    }

    public void print(){
        System.out.println("---------- BaseClass ------------");
    }
}
