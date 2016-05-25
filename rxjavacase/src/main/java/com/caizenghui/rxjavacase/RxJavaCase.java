package com.caizenghui.rxjavacase;

import java.util.ArrayList;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class RxJavaCase {

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test5_1();
//        test6();
//        test7();
        test8();
//        test9();
//        test10();
//        test11();
    }

    private static void test11() {
        Observable.just(1,3,5,0,4,3)
                .filter(new Func1<Integer, Boolean>() {
                    @Override
                    public Boolean call(Integer integer) {
                        return integer != 0;
                    }
                })
                .doOnNext(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        // 不会改变 integer；
                        integer++;
                    }
                })
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        System.out.println(integer);
                    }
                });
    }

    private static void test10() {
        Observable.just(1,3,5,7,9)
                .take(3)
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        System.out.println(integer);
                    }
                });
    }

    private static void test9() {
        Observable.just(1,3,0,5,8)
                .filter(new Func1<Integer, Boolean>() {
                    @Override
                    public Boolean call(Integer integer) {
                        return integer != 0;
                    }
                })
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        System.out.println(integer);
                    }
                });
    }

    private static void test8() {
        Observable.just("a","b","c")
                .flatMap(new Func1<String, Observable<Integer>>() {
                    @Override
                    public Observable<Integer> call(String s) {
                        System.out.println("Thread-->"+Thread.currentThread().getName());
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        return Observable.just(s.hashCode());
                    }
                })
//                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        System.out.println("Thread-->"+Thread.currentThread().getName());
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(integer);
                    }
                });
    }

    private static void test7() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        Observable.from(arr)
                .flatMap(new Func1<String, Observable<Integer>>() {
                    @Override
                    public Observable<Integer> call(String s) {
                        return Observable.just(s.hashCode());
                    }
                })
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer o) {
                        System.out.println(o);
                    }
                });
    }

    private static void test6() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        Observable.from(arr)
                .flatMap(new Func1<String, Observable<?>>() {
                    @Override
                    public Observable<String> call(String s) {
                        return Observable.just(s);
                    }
                })
                .subscribe(new Action1<Object>() {
                    @Override
                    public void call(Object o) {
                        System.out.println(o.toString());
                    }
                });
    }

    private static void test5_1() {
        Observable.just(0,1,2,3,4)
                .map(new Func1<Integer, Integer>() {
                    @Override
                    public Integer call(Integer integer) {
                        return integer+5;
                    }
                })
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        System.out.println(integer);
                    }
                });
    }

    private static void test5() {
        Observable.just("hello test5")
                .map(new Func1<String, Integer>() {
                    @Override
                    public Integer call(String s) {
                        return s.hashCode();
                    }
                })
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        System.out.println(integer);
                    }
                });
    }

    private static void test4() {
        Observable.just("hello test4")
                .map(new Func1<String, String>() {
                    @Override
                    public String call(String s) {
                        return s + "suffix";
                    }
                })
                .subscribe(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        System.out.println("call---->" + s);
                    }
                });

    }

    private static void test3() {
        Observable.just("hello test3").subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println("call ---->" + s);
            }
        });
    }


    private static void test2() {
        Observable<String> mObservable = Observable.just("hello test2");
        Action1<String> action = new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println("call --->" + s);
            }
        };

        mObservable.subscribe(action);
    }


    private static void test1() {
        Observable<String> mObservable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("hello rxjava");
                subscriber.onCompleted();
            }
        });

        Subscriber<String> mSubscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String s) {
                System.out.println("onNext-->" + s);
            }
        };

        mObservable.subscribe(mSubscriber);
    }
}
