package com.caizenghui.threadcase;

/**
 * Created by caizenghui on 16/5/13.
 */
public class Thread1 extends Thread{
    @Override
    public void run() {
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("t1 has been interrupted-->alive");
        System.out.println("is t1 interrupt--->"+isInterrupted());
    }
}
