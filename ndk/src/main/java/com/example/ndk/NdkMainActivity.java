package com.example.ndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NdkMainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv;
    JniUtil jniUtil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ndk_main);
        tv = (TextView) findViewById(R.id.tv);

        findViewById(R.id.btn_crash).setOnClickListener(this);
        findViewById(R.id.btn_normal).setOnClickListener(this);

        jniUtil = new JniUtil();
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_crash) {
            String jniStr = jniUtil.crash();
            tv.setText(jniStr);
        } else if (i == R.id.btn_normal) {
            String jniStr = jniUtil.getJniStr();
            tv.setText(jniStr);
        }
    }
}
