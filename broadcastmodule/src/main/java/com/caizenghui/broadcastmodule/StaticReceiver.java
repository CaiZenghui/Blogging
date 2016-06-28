package com.caizenghui.broadcastmodule;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class StaticReceiver extends BroadcastReceiver {
    public StaticReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("StaticReceiver","onReceive");
    }
}
