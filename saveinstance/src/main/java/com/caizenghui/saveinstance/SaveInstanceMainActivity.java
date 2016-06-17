package com.caizenghui.saveinstance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

public class SaveInstanceMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_instance_main);
        ViewGroup vg = (ViewGroup) findViewById(R.id.root);

        CustomerEditText et1 = new CustomerEditText(this);
        CustomerEditText et2 = new CustomerEditText(this);
        CustomerTextView tv = new CustomerTextView(this);

        vg.addView(tv);
        vg.addView(et1);
        vg.addView(et2);

    }
}
