package com.caizenghui.broadcastmodule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BroadCastMainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast_main);
        Intent intent = new Intent();
        intent.setAction("com.caizenghui.blogging.stickybroadcast");
        sendStickyBroadcast(intent);

        findViewById(R.id.btn_sticky_broadcast).setOnClickListener(this);
        findViewById(R.id.btn_local_broadcast_manager).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_sticky_broadcast) {
            Intent intent = new Intent(this, StickyBroadcastActivity.class);
            startActivity(intent);
        }else if (i == R.id.btn_local_broadcast_manager) {
            Intent intent = new Intent(this, LocalBroadcastManagerActivity.class);
            startActivity(intent);
        }
    }
}
