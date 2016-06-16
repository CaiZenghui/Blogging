package com.caizenghui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FragmentMainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_main2);
        findViewById(R.id.btn_commit_case).setOnClickListener(this);
        findViewById(R.id.btn_add_to_backstack).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_commit_case) {
            Intent intent = new Intent(this, FragmentCommitActivity.class);
            startActivity(intent);
        } else if (i == R.id.btn_add_to_backstack) {
            Intent intent = new Intent(this, AddToBackStackActivity.class);
            startActivity(intent);
        }
    }
}
