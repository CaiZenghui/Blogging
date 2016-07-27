package com.example.extendcase;

/**
 * Created by caizenghui on 16/7/26.
 */
public class BaseClass {
    /**
     * 成员变量不会被子类的覆盖；
     */
    public static int a = 10;
    private static BaseClass instance;

    public static BaseClass getInstance(){
        return instance;
    }

    /**
     * 当创建 ChildClass 对象的时候，会调用父类的构造方法，但并不会主动创建父类的对象，所以此处的 instance 还是子类的对象;
     */
    public BaseClass() {
        instance = this;
        says();// 由于 says() 方法是被 private 修饰的，此处调用该类中的 says() 方法；
        print();// 由于 print() 方法是被 public 修饰的，此处调用 ChildClass 中的 print() 方法;
    }


    public void print(){
        System.out.println("---------- BaseClass print ------------");
    }

    private void says(){
        System.out.println("---------- BaseClass says ------------");
    }
}
