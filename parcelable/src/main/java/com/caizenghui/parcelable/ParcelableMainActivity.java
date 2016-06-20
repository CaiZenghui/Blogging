package com.caizenghui.parcelable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ParcelableMainActivity extends AppCompatActivity {
    public static final String DATA = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable_main);

        User user = getIntent().getParcelableExtra(DATA);

        Log.d("Parcelable",user.toString());
    }
}
