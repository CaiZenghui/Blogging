package com.caizenghui.retrofitcase.net;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by caizenghui on 16/5/25.
 */
public class ServiceFactory {
    public static HttpService getService() {
        return new Retrofit.Builder()
                .baseUrl("https://tcc.taobao.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build().create(HttpService.class);
    }
}
