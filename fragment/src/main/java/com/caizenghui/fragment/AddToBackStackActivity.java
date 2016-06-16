package com.caizenghui.fragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AddToBackStackActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_back_stack);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
    }

    Fragment fragment1;
    Fragment fragment2;
    Fragment fragment3;

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn1) {
            if (fragment1 == null) {
                fragment1 = new Fragment1();
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.root, fragment1).commit();
        } else if (i == R.id.btn2) {
            if (fragment2 == null) {
                fragment2 = new Fragment2();
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.root, fragment2).addToBackStack(null).commit();
        } else if (i == R.id.btn3) {
            if (fragment3 == null) {
                fragment3 = new Fragment3();
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.root, fragment3).commit();
        } else if (i == R.id.btn4) {
            getSupportFragmentManager().beginTransaction().replace(R.id.root, fragment2).addToBackStack(null).commit();
        }
    }
}
