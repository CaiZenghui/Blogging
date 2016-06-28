package com.caizenghui.blogging;

import android.util.Log;

import com.caizenghui.baseapplication.BaseApplication;

/**
 * Created by caizenghui on 16/5/31.
 */
public class MyApplication extends BaseApplication{

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d("StaticReceiver", "MyApplication onCreate()");
    }
}
