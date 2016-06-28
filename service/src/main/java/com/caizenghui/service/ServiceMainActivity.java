package com.caizenghui.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class ServiceMainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_main);
        findViewById(R.id.btn_get_message).setOnClickListener(this);
    }


    TestService.MyBinder myBinder;
    private ServiceConnection pollingServiceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            myBinder = (TestService.MyBinder) service;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
        }
    };

    @Override
    protected void onResume() {
        super.onResume();

        Intent intent = new Intent(this, TestService.class);
        bindService(intent, pollingServiceConnection, Context.BIND_AUTO_CREATE);
    }

    @Override
    protected void onPause() {
        super.onPause();
        try {
            unbindService(pollingServiceConnection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_get_message) {
           String msg = myBinder.getMsg();
            Log.d("SERVICE","msg--->"+msg+"--->"+ Process.myPid());
        }
    }
}
