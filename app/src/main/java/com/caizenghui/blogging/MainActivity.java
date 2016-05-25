package com.caizenghui.blogging;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.caizenghui.edittext.EditTextMainActivity;
import com.caizenghui.retrofitcase.RetroficMainActivity;
import com.caizenghui.rxandroidcase.RxAndroidMainActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_et_case).setOnClickListener(this);
        findViewById(R.id.btn_rxandroid).setOnClickListener(this);
        findViewById(R.id.btn_retrofit).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_et_case: {
                Intent intent = new Intent(MainActivity.this, EditTextMainActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_rxandroid: {
                Intent intent = new Intent(MainActivity.this, RxAndroidMainActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_retrofit: {
                Intent intent = new Intent(MainActivity.this, RetroficMainActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
