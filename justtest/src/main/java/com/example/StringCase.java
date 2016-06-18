package com.example;

public class StringCase {

    public static void main(String[] args){

        String str = "aaa";
        System.out.println(str.hashCode()+"-->"+str);
        change(str);

        System.out.println(str.hashCode()+"-->"+str);

    }

    private static void change(String string){
        System.out.println(string.hashCode()+"-->"+string);
        string = "bbb";
        System.out.println(string.hashCode()+"-->"+string);
    }
}
