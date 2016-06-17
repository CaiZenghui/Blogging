package com.caizenghui.measurelayoutdraw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MeasureMainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure_main);
        findViewById(R.id.btn_measure_case).setOnClickListener(this);
        findViewById(R.id.btn_only_measure).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_measure_case) {
            Intent intent = new Intent(this, MeasureCaseActivity.class);
            startActivity(intent);
        } else if (i == R.id.btn_only_measure) {
            Intent intent = new Intent(this, OnlyMeasureActivity.class);
            startActivity(intent);
        }
    }
}
