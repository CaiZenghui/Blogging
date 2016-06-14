package com.caizenghui.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

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
//            if (plusOneFragment == null) {
//                plusOneFragment = PlusOneFragment.newInstance("1", "2");
//                transaction.add(R.id.root,plusOneFragment,"tag1");
//            }
            findViewById(R.id.root).postDelayed(new Runnable() {
                @Override
                public void run() {
                    final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    if (getSupportFragmentManager().findFragmentByTag("tag1") == null) {
                        plusOneFragment = PlusOneFragment.newInstance("1", "2");
                        transaction.add(R.id.root, plusOneFragment, "tag1");
                    } else {
                        plusOneFragment = (PlusOneFragment) getSupportFragmentManager().findFragmentByTag("tag1");
                    }
                    if (getSupportFragmentManager().findFragmentByTag("tag2") != null) {
                        plusTwoFragment = (PlusTwoFragment) getSupportFragmentManager().findFragmentByTag("tag2");
                        transaction.hide(plusTwoFragment);
                    }
                    transaction.show(plusOneFragment).commitAllowingStateLoss();
                }
            }, 3000);
        } else if (i == R.id.btn_fragment2) {
//            if (plusTwoFragment == null) {
//                plusTwoFragment = PlusTwoFragment.newInstance("1", "2");
//                transaction.add(R.id.root,plusTwoFragment);
//            }

            findViewById(R.id.root).postDelayed(new Runnable() {
                @Override
                public void run() {
                    final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    if (getSupportFragmentManager().findFragmentByTag("tag2") == null) {
                        plusTwoFragment = PlusTwoFragment.newInstance("1", "2");
                        transaction.add(R.id.root, plusTwoFragment, "tag2");
                    } else {
                        plusTwoFragment = (PlusTwoFragment) getSupportFragmentManager().findFragmentByTag("tag2");
                    }
                    if (getSupportFragmentManager().findFragmentByTag("tag1") != null) {
                        plusOneFragment = (PlusOneFragment) getSupportFragmentManager().findFragmentByTag("tag1");
                        transaction.hide(plusOneFragment);
                    }
                    transaction.show(plusTwoFragment).commitAllowingStateLoss();
                }
            }, 3000);
        }
    }
}
