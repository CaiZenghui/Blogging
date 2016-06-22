package com.example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallalbleCase {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(1);
        System.out.println("service begin to run");
        Future<Integer> future = service.submit(new MyCallable());

        try {
            int i = future.get();
            System.out.println("get---->"+i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        service.shutdown();
        System.out.println("service shut down");
    }

    static class MyCallable implements Callable{
        @Override
        public Integer call() {
            System.out.println("MyCallable begin to run");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MyCallable is end");
            return 10;
        }
    }
}
