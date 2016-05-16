package com.caizenghui.threadcase;

/**
 * Created by caizenghui on 16/5/13.
 */
public class Thread3 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("------ interrupt status------>"+Thread.currentThread().isInterrupted());
            if (i==0){
                Thread.currentThread().interrupt();
            }
        }

    }

}
