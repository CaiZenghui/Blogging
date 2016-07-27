package com.example.extendcase;

/**
 * Created by caizenghui on 16/7/26.
 */
public class MainClass {
    public static void main(String[] args){
        ChildClass childClass = new ChildClass();

        System.out.println(BaseClass.a+"");
        System.out.println(ChildClass.a+"");

        BaseClass.getInstance().print();
        ChildClass.getInstance().print();
    }
}
