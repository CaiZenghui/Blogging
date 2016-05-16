package com.caizenghui.threadcase;

/**
 * Created by caizenghui on 16/5/13.
 */
public class Thread2 extends Thread{
    Thread t;
    public Thread2(Thread1 t1) {
        this.t = t1;
    }

    @Override
    public void run() {
        try {
            Thread.currentThread().sleep(2000);
            System.out.println("is t1 interrupt--->"+t.isInterrupted());
            t.interrupt();
            System.out.println("is t1 interrupt--->"+t.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
