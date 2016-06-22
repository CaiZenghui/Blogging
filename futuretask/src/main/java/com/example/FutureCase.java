package com.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FutureCase {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(1);
        System.out.println("service begin to run");
        Future<Integer> future = service.submit(new MyRunnable(), 10);
//        Future<?> future = service.submit(new MyRunnable());
        try {
            int i = future.get();// 会造成线程阻塞;
//            Object o = future.get(2, TimeUnit.SECONDS);// 会造成线程阻塞; 但2s后若任务未执行完，则抛出TimeoutException，线程不再阻塞；任务仍会在线程中继续执行;
            System.out.println("after get");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        service.shutdown();
        System.out.println("service shut down");
    }

    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("MyRunnable begin to run");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MyRunnable is end");
        }
    }
}
