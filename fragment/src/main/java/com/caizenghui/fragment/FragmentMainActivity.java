package com.caizenghui.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FragmentMainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_main);

        findViewById(R.id.btn_fragment1).setOnClickListener(this);
        findViewById(R.id.btn_fragment2).setOnClickListener(this);
    }

    PlusOneFragment plusOneFragment;
    PlusTwoFragment plusTwoFragment;

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_fragment1) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            if (plusOneFragment == null) {
                plusOneFragment = PlusOneFragment.newInstance("1", "2");
                transaction.add(R.id.root,plusOneFragment);
            }
            if (plusTwoFragment !=null){
                transaction.hide(plusTwoFragment);
            }
            transaction.show(plusOneFragment).commit();
        } else if (i == R.id.btn_fragment2) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            if (plusTwoFragment == null) {
                plusTwoFragment = PlusTwoFragment.newInstance("1", "2");
                transaction.add(R.id.root,plusTwoFragment);
            }
            if (plusOneFragment !=null){
                transaction.hide(plusOneFragment);
            }
            transaction.show(plusTwoFragment).commit();
        }
    }
}
