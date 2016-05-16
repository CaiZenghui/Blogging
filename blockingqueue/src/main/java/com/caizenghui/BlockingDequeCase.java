package com.caizenghui;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingDequeCase {
    static BlockingDeque queue;

    public static void main(String[] args) {
        queue = new LinkedBlockingDeque(10);
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(new PutRunnable());
        service.execute(new TakeRunnable());

    }

    static class TakeRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.currentThread().sleep(2000);
                    queue.takeLast();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("take---->" + i);
            }
        }
    }

    static class PutRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                try {
                    queue.putFirst(i);
                    System.out.println("put---->" + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
