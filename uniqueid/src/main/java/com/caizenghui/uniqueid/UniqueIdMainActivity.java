package com.caizenghui.uniqueid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class UniqueIdMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unique_id_main);

        ((TextView)findViewById(R.id.tv)).setText(UniqueUtils.getUniquePsuedoID());
    }
}
