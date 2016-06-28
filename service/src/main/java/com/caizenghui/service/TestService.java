package com.caizenghui.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;

public class TestService extends Service {
    public TestService() {
    }

    MyBinder myBinder = new MyBinder();

    @Override
    public IBinder onBind(Intent intent) {
        return myBinder;
    }

    class MyBinder extends Binder {
        public String getMsg() {
            Log.d("SERVICE","msg--->"+ Process.myPid());
            return "from remote service";
        }
    }
}
