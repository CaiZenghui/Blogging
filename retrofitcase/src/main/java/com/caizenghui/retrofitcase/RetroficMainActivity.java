package com.caizenghui.retrofitcase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.caizenghui.retrofitcase.net.PhoneInfo;
import com.caizenghui.retrofitcase.net.ServiceFactory;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class RetroficMainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofic_main);

        findViewById(R.id.btn_get).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_get) {
            case2();
        }
    }

    void case2(){
        ServiceFactory.getService().loadPhoneInfo("18516556576")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<PhoneInfo>() {
                    @Override
                    public void call(PhoneInfo phoneInfo) {
                        Log.d("RetrofitCase", Thread.currentThread().getName());
                        Log.d("RetrofitCase", phoneInfo.getProvince());
                    }
                });



    }
        void case1(){
            Call<PhoneInfo> call = ServiceFactory.getService().getPhoneInfo("18516556576");
            call.enqueue(new Callback<PhoneInfo>() {
                @Override
                public void onResponse(Call<PhoneInfo> call, Response<PhoneInfo> response) {
                    Log.d("RetrofitCase", response.body().getProvince());
                }

                @Override
                public void onFailure(Call<PhoneInfo> call, Throwable t) {
                    Log.d("RetrofitCase", t.getMessage());
                }
            });
        }

}
