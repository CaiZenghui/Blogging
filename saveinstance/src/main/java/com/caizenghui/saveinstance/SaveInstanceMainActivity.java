package com.caizenghui.saveinstance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class SaveInstanceMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_instance_main);
        ViewGroup vg = (ViewGroup) findViewById(R.id.root);

        CustomerEditText et1 = new CustomerEditText(this);
        CustomerEditText et2 = new CustomerEditText(this);
        CustomerTextView tv = new CustomerTextView(this);
        Button button = new Button(this);
        button.setId(R.id.et);
        vg.addView(button, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        View view = new View(this);
        view.setId(R.id.et);
        vg.addView(view, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 50));

        vg.addView(tv);
        vg.addView(et1);
        vg.addView(et2);

    }
}
