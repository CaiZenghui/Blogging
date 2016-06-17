package com.caizenghui.broadcastmodule;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class StickyBroadcastActivity extends AppCompatActivity {
    MyReceiver myReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sticky_broadcast);
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.caizenghui.blogging.stickybroadcast");
        myReceiver = new MyReceiver();
        registerReceiver(myReceiver,filter);
    }

    class MyReceiver extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            int i =0;
            Log.d("StickyBroadcastActivity","onReceive()");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(myReceiver);
    }
}
