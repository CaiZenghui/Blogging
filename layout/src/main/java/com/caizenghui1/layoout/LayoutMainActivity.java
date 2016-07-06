package com.caizenghui1.layoout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class LayoutMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_main);
        final View view = findViewById(R.id.tv);
        getWindow().getDecorView().postDelayed(new Runnable() {
            @Override
            public void run() {
                int MeasuredHeight = view.getMeasuredHeight();
                int MeasuredWidth = view.getMeasuredWidth();
                Log.d("Layout", "MeasuredHeight = " + MeasuredHeight + "; MeasuredWidth = " + MeasuredWidth);

                int height = view.getHeight();
                int width = view.getWidth();
                Log.d("Layout", "height = " + height + "; width = " + width);
            }
        }, 1000);
    }
}
