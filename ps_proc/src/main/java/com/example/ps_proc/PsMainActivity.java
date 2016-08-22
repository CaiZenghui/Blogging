package com.example.ps_proc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PsMainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ps_main);


        et = (TextView) findViewById(R.id.et);

        findViewById(R.id.bt).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int i = view.getId();
        if (i == R.id.bt) {
            executePS(et.getText().toString().trim());
        }
    }

    private void executePS(String execute) {
        // TODO Auto-generated method stub
        try {
            Runtime r = Runtime.getRuntime();
            Process p = r.exec(execute);
            BufferedReader br = new BufferedReader(new InputStreamReader(p
                    .getInputStream()));
            String inline;
            while ((inline = br.readLine()) != null) {
                    Log.i("PS", "" + inline);
            }
            br.close();
//            StringTokenizer processInfoTokenizer = new StringTokenizer(inline);
//            int count = 0;
//            while (processInfoTokenizer.hasMoreTokens()) {
//                count++;
//                processId = processInfoTokenizer.nextToken();
//                if (count == 2) {
//                    break;
//                }
//            }
//            r.exec("kill -15 " + processId);
        } catch (IOException ex) {
        }
    }
}
