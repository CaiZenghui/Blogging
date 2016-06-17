package com.caizenghui.blogging;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.caizenghui.andfix.AndFixMainActivity;
import com.caizenghui.broadcastmodule.BroadCastMainActivity;
import com.caizenghui.edittext.EditTextMainActivity;
import com.caizenghui.fragment.FragmentMainActivity;
import com.caizenghui.measurelayoutdraw.MeasureMainActivity;
import com.caizenghui.retrofitcase.RetroficMainActivity;
import com.caizenghui.rxandroidcase.RxAndroidMainActivity;
import com.caizenghui.service.ServiceMainActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_et_case).setOnClickListener(this);
        findViewById(R.id.btn_rxandroid).setOnClickListener(this);
        findViewById(R.id.btn_retrofit).setOnClickListener(this);
        findViewById(R.id.btn_andfix).setOnClickListener(this);
        findViewById(R.id.btn_service).setOnClickListener(this);
        findViewById(R.id.btn_fragment).setOnClickListener(this);
        findViewById(R.id.btn_measure).setOnClickListener(this);
        findViewById(R.id.btn_broadcast).setOnClickListener(this);

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
            case R.id.btn_andfix: {
                Intent intent = new Intent(MainActivity.this, AndFixMainActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_service: {
                Intent intent = new Intent(MainActivity.this, ServiceMainActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_fragment:{
                Intent intent = new Intent(MainActivity.this, FragmentMainActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_measure:{
                Intent intent = new Intent(MainActivity.this, MeasureMainActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_broadcast:{
                Intent intent = new Intent(MainActivity.this, BroadCastMainActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
