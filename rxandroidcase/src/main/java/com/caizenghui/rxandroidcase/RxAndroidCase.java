package com.caizenghui.rxandroidcase;


import android.util.Log;

import java.util.List;
import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by caizenghui on 16/5/25.
 */
public class RxAndroidCase {

    public static void main(String[] args) {
        testj();
    }

    private static void testj() {
    }

    private static void testi() {
        Observable observable1 = Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                Log.d("RxAndroidCase", "observable1--->" + Thread.currentThread().getName());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                subscriber.onNext(0);
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.newThread());
        Observable observable2 = Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                Log.d("RxAndroidCase", "observable2--->" + Thread.currentThread().getName());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                subscriber.onNext(1);
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.io());

        Observable.merge(observable1,observable2)
                .buffer(2)
                .subscribe(new Action1() {
                    @Override
                    public void call(Object o) {
                        Log.d("RxAndroidCase", o.toString());
                    }
                });
    }

    /**
     <------>
     <------>
     <------>
     <------>
     */
    private static void testh() {
        Observable.create(new Observable.OnSubscribe<Object>() {
            @Override
            public void call(Subscriber<? super Object> subscriber) {
                System.out.println("<------>");
                subscriber.onError(null);
            }
        }).retry(3)
                .subscribe(new Action1<Object>() {
                    @Override
                    public void call(Object o) {
                        System.out.println("------>");
                    }
                });
    }

    /**
     * [0, 1, 2] skip --> 3
     * [4, 5, 6]
     */
    private static void testg() {
        Observable.just(0, 1, 2, 3, 4, 5, 6).buffer(3, 4)
                .subscribe(new Action1<List<Integer>>() {
                    @Override
                    public void call(List<Integer> integers) {
                        System.out.println(integers);
                    }
                });
    }

    /**
     * [0, 1, 2]  skip -->0,1
     * [2, 3, 4]  skip -->1,3
     * [4, 5, 6]  skip -->4,5
     * [6]
     */
    private static void testf() {
        Observable.just(0, 1, 2, 3, 4, 5, 6).buffer(3, 2)
                .subscribe(new Action1<List<Integer>>() {
                    @Override
                    public void call(List<Integer> integers) {
                        System.out.println(integers);
                    }
                });
    }

    private static void teste() {
        Observable.just(0, 1, 2, 3, 4, 5, 6).buffer(2)
                .subscribe(new Action1<List<Integer>>() {
                    @Override
                    public void call(List<Integer> integers) {
                        System.out.println(integers);
                    }
                });
    }

    private static void testd() {
        Observable observable1 = Observable.range(1, 1000, Schedulers.newThread());
        Observable observable2 = Observable.range(1000, 1000, Schedulers.newThread());
        Observable observable3 = Observable.range(2000, 1000, Schedulers.newThread());
        Observable.concat(observable1, observable2, observable3)
                .subscribe(new Action1() {
                    @Override
                    public void call(Object o) {
                        Log.d("RxAndroidCase", Thread.currentThread().getName() + "-->" + o.toString());
                    }
                });
    }

    /**
     * 线程交替输出,各自在各自线程输出;
     */
    private static void testc() {
        Observable observable1 = Observable.range(1, 1000, Schedulers.newThread());
        Observable observable2 = Observable.range(1000, 1000, Schedulers.newThread());
        Observable observable3 = Observable.range(2000, 1000, Schedulers.newThread());
        Observable.merge(observable1, observable2, observable3)
                .subscribe(new Action1() {
                    @Override
                    public void call(Object o) {
                        Log.d("RxAndroidCase", Thread.currentThread().getName() + "-->" + o.toString());
                    }
                });
    }

    /**
     * 第一个线程先输出,第二个线程后输出,各自在各自线程输出;
     */
    private static void testb() {
        Observable observable1 = Observable.range(1, 20, Schedulers.newThread());
        Observable observable2 = Observable.range(3, 40, Schedulers.io());
        Observable.concat(observable1, observable2)
                .subscribe(new Action1() {
                    @Override
                    public void call(Object o) {
                        Log.d("RxAndroidCase", Thread.currentThread().getName() + "-->" + o.toString());
                    }
                });
    }

    private static void testa() {
        Observable observable1 = Observable.interval(0, 2, TimeUnit.SECONDS, Schedulers.io());
        Observable observable2 = Observable.interval(0, 3, TimeUnit.SECONDS, Schedulers.newThread());
        Observable.concat(observable1, observable2)
                .subscribe(new Action1() {
                    @Override
                    public void call(Object o) {
                        Log.d("RxAndroidCase", Thread.currentThread().getName() + "-->" + o.toString());
                    }
                });
    }

    /**
     * 两个线程交替输出,各自在各自线程输出;
     */
    private static void test16() {
        Observable observable1 = Observable.interval(0, 2, TimeUnit.SECONDS, Schedulers.io());
        Observable observable2 = Observable.interval(0, 3, TimeUnit.SECONDS, Schedulers.newThread());
        Observable.merge(observable1, observable2)
                .subscribe(new Action1() {
                    @Override
                    public void call(Object o) {
                        Log.d("RxAndroidCase", Thread.currentThread().getName() + "-->" + o.toString());
                    }
                });
    }

    private static void test12() {
        Observable observable1 = Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                subscriber.onNext(0);
                subscriber.onCompleted();
            }
        });
        Observable observable2 = Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                subscriber.onNext(1);
                subscriber.onCompleted();
            }
        });
        Observable.concat(observable1, observable2)
                .subscribe(new Action1() {
                    @Override
                    public void call(Object o) {
                        Log.d("RxAndroidCase", o.toString());
                    }
                });
    }

    private static void test1() {
        Observable.just(0, 1, 2, 3, 4)
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Func1<Integer, String>() {
                    @Override
                    public String call(Integer integer) {
                        Log.d("RxAndroidCase", "map--->" + Thread.currentThread().getName());
                        return (integer + 5) + "";
                    }
                })
                .observeOn(Schedulers.computation())
                .flatMap(new Func1<String, Observable<String>>() {
                    @Override
                    public Observable<String> call(String s) {
                        Log.d("RxAndroidCase", "flatMap--->" + Thread.currentThread().getName());
                        return Observable.just(s + "--->");
                    }
                })
                .subscribeOn(Schedulers.newThread())
                .observeOn(Schedulers.computation())
                .doOnSubscribe(new Action0() {
                    @Override
                    public void call() {
                        Log.d("RxAndroidCase", "doOnSubscribe--->" + Thread.currentThread().getName());
                    }
                })
                .subscribeOn(Schedulers.computation())
                .observeOn(Schedulers.newThread())
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onStart() {
                        Log.d("RxAndroidCase", "onStart--->" + Thread.currentThread().getName());
                    }

                    public void onCompleted() {
                    }

                    public void onError(Throwable e) {
                    }

                    public void onNext(String s) {
                        Log.d("RxAndroidCase", "onNext--->" + Thread.currentThread().getName());
                        Log.d("RxAndroidCase", s);
                    }
                });
    }
}
