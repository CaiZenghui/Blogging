package com.caizenghui.measurelayoutdraw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import org.json.JSONObject;

public class MeasureCaseActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure_case);

        findViewById(R.id.btn_start).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_start) {
            setSegments();
        }
    }

    String[] arr = {"afdasdfasdf", "2"};
    int balance_id = 0;
    private void setSegments() {
        final LinearLayout vg = new LinearLayout(this);
        vg.setOrientation(LinearLayout.HORIZONTAL);
        vg.setGravity(Gravity.CENTER);
        ((ViewGroup) findViewById(R.id.root)).addView(vg);
        String segment_name_balance = "";
        for (int i = 0; i < arr.length; i++) {
            try {
                String segment_name = arr[i];
                if (segment_name_balance.length() < segment_name.length()) {
                    segment_name_balance = segment_name;
                    balance_id = i;
                }
                Button item = new Button(this);
                item.setText(segment_name);
                vg.addView(item);
                ViewGroup.LayoutParams params = item.getLayoutParams();
                params.height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 35, getResources().getDisplayMetrics());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (vg.getChildCount() > 0) {
            final View item = vg.getChildAt(balance_id);
            int width1 = View.MeasureSpec.makeMeasureSpec(ViewGroup.LayoutParams.WRAP_CONTENT, View.MeasureSpec.AT_MOST);
            int height1 = View.MeasureSpec.makeMeasureSpec((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 35, getResources().getDisplayMetrics()), View.MeasureSpec.EXACTLY);
//            item.measure(width1,height1);
            item.post(new Runnable() {
                @Override
                public void run() {
                    int width = item.getMeasuredWidth();

                    for (int i = 0; i < vg.getChildCount(); i++) {
                        if (i != balance_id) {
                            View child = vg.getChildAt(i);
                            ViewGroup.LayoutParams params = child.getLayoutParams();
                            params.width = width;
                            child.setLayoutParams(params);// 此处需要这句话，因为该语句执行在另一个msg循环中；若执行在post方法外，则不需要该语句；
                        }
                    }
                }
            });

        }
    }
}
