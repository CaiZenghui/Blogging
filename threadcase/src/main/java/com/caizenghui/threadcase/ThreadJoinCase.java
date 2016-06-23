package com.caizenghui.threadcase;

import java.util.concurrent.TimeUnit;

/**
 * Created by caizenghui on 16/6/23.
 */
public class ThreadJoinCase {

    public static void main (String[] args){
        Thread t1 = new Thread(new MyRunnable(2));
        Thread t2 = new Thread(new MyRunnable(8));
        Thread t3 = new Thread(new MyRunnable(4));

        t1.start();
        t2.start();
        t3.start();

        try {
            System.out.println("join() start");
            System.out.println("t1 joined");
            t1.join();
            System.out.println("t2 joined");
            t2.join();
            System.out.println("t3 joined");
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class MyRunnable implements Runnable{
        int t;
        public MyRunnable(int time){
            this.t = time;
        }
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "start");
            try {
                TimeUnit.SECONDS.sleep(t);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "end");
        }
    }
}
