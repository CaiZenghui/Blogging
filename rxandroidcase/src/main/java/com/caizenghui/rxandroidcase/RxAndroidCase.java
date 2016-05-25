package com.caizenghui.rxandroidcase;


import android.util.Log;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by caizenghui on 16/5/25.
 */
public class RxAndroidCase {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        Observable.just(0, 1, 2, 3, 4)
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Func1<Integer, String>() {
                    @Override
                    public String call(Integer integer) {
                        Log.d("RxAndroidCase", "map--->" +Thread.currentThread().getName());
                        return (integer + 5) + "";
                    }
                })
                .observeOn(Schedulers.computation())
                .flatMap(new Func1<String, Observable<String>>() {
                    @Override
                    public Observable<String> call(String s) {
                        Log.d("RxAndroidCase", "flatMap--->" +Thread.currentThread().getName());
                        return Observable.just(s+"--->");
                    }
                })
                .subscribeOn(Schedulers.newThread())
                .observeOn(Schedulers.computation())
                .doOnSubscribe(new Action0() {
                    @Override
                    public void call() {
                        Log.d("RxAndroidCase", "doOnSubscribe--->" +Thread.currentThread().getName());
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
