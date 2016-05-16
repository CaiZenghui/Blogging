package com.caizenghui.threadcase;

/**
 * Created by caizenghui on 16/5/13.
 */
public class ThreadJoin extends Thread{
    private Thread t = new ThreadHelp();
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(String.format("************%d*********",i));
            if (i==5){
                try {
                    t.start();
                    t.join();
                } catch (InterruptedException e) {
                }
            }
        }

    }

    class ThreadHelp extends Thread{
        @Override
        public void run() {
            for (int i=0;i<10;i++){
                System.out.println(String.format("************ThreadHelp:%d*********",i));
                if (i==4){
                    ThreadJoin.this.interrupt();
                }
            }
        }
    }

}
