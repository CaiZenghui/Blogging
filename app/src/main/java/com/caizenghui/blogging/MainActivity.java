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
import com.caizenghui.parcelable.ParcelableMainActivity;
import com.caizenghui.parcelable.User;
import com.caizenghui.parcelableserializable.ParcelableSerializableMainActivity;
import com.caizenghui.retrofitcase.RetroficMainActivity;
import com.caizenghui.rxandroidcase.RxAndroidMainActivity;
import com.caizenghui.saveinstance.SaveInstanceMainActivity;
import com.caizenghui.service.ServiceMainActivity;
import com.caizenghui.uniqueid.UniqueIdMainActivity;
import com.caizenghui1.bmodule.BModuleMainActivity;
import com.caizenghui1.layoout.LayoutMainActivity;
import com.caizenghui1.video.VideoMainActivity;
import com.example.getrunningapps.RunningAppsMainActivity;

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
        findViewById(R.id.btn_save_instance).setOnClickListener(this);
        findViewById(R.id.btn_parcelable).setOnClickListener(this);
        findViewById(R.id.btn_parcelable_serializable).setOnClickListener(this);
        findViewById(R.id.unique_id).setOnClickListener(this);
        findViewById(R.id.btn_video).setOnClickListener(this);
        findViewById(R.id.btn_layout).setOnClickListener(this);
        findViewById(R.id.btn_independent_jar).setOnClickListener(this);
        findViewById(R.id.btn_running_apps).setOnClickListener(this);

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
            case R.id.btn_fragment: {
                Intent intent = new Intent(MainActivity.this, FragmentMainActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_measure: {
                Intent intent = new Intent(MainActivity.this, MeasureMainActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_broadcast: {
                Intent intent = new Intent(MainActivity.this, BroadCastMainActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_save_instance: {
                Intent intent = new Intent(MainActivity.this, SaveInstanceMainActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_parcelable: {
                Intent intent = new Intent(MainActivity.this, ParcelableMainActivity.class);
                User user = new User(2.0, "name1", 30, "address1");
                intent.putExtra(ParcelableMainActivity.DATA, user);
                startActivity(intent);
                break;
            }
            case R.id.btn_parcelable_serializable: {
                Intent intent = new Intent(MainActivity.this, ParcelableSerializableMainActivity.class);
                User user = new User(2.0, "name1", 30, "address1");
                intent.putExtra(ParcelableMainActivity.DATA, user);
                startActivity(intent);
                break;
            }
            case R.id.unique_id: {
                Intent intent = new Intent(MainActivity.this, UniqueIdMainActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_video: {
                Intent intent = new Intent(MainActivity.this, VideoMainActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_layout: {
                Intent intent = new Intent(MainActivity.this, LayoutMainActivity.class);
                startActivity(intent);
                break;
            }case R.id.btn_independent_jar: {
                Intent intent = new Intent(MainActivity.this, BModuleMainActivity.class);
                startActivity(intent);
                break;
            }case R.id.btn_running_apps: {
                Intent intent = new Intent(MainActivity.this, RunningAppsMainActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
