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
     * 当创建 ChildClass 对象的时候，会调用父类的构造方法，当并不会主动创建父类的对象，所以此处的 instance 还是子类的对象;
     */
    public BaseClass() {
        instance = this;
    }


    public void print(){
        System.out.println("---------- BaseClass ------------");
    }
}
