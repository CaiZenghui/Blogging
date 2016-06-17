package com.caizenghui.broadcastmodule;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LocalBroadcastManagerActivity extends AppCompatActivity implements View.OnClickListener{
    MyReceiver myReceiver;
    LocalBroadcastManager lbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_broadcast_manager);

        findViewById(R.id.btn_send_local_broadcast).setOnClickListener(this);

        lbm = LocalBroadcastManager.getInstance(this);
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.caizenghui.blogging.localbroadcast");
        myReceiver = new MyReceiver();
        lbm.registerReceiver(myReceiver,filter);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_send_local_broadcast) {
            LocalBroadcastManager lbm = LocalBroadcastManager.getInstance(this);
            Intent intent1 = new Intent();
            intent1.setAction("com.caizenghui.blogging.localbroadcast");
            lbm.sendBroadcast(intent1);
        }
    }

    class MyReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            int i =0;
            Log.d("LocalBroadcastManager","onReceive()");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        lbm.unregisterReceiver(myReceiver);
    }
}
