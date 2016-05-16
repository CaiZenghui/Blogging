package com.caizenghui.threadcase;

public class ThreadCase {
    private static final String TAG = ThreadCase.class.getSimpleName();
    public static void main(String[] args) {
        System.out.println(String.format("*************%s*************", TAG));

//        Thread1 t1 = new Thread1();
//        Thread2 t2 = new Thread2(t1);
//        t1.start();
//        t2.start();

//        Thread t3 = new Thread3();
//        t3.start();

        ThreadJoin threadJoin = new ThreadJoin();
        threadJoin.start();

    }

}
