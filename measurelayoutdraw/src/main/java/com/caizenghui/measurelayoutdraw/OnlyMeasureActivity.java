package com.caizenghui.measurelayoutdraw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OnlyMeasureActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_only_measure);

        findViewById(R.id.btn_measure).setOnClickListener(this);
        et = (EditText) findViewById(R.id.et);
        tv = (TextView) findViewById(R.id.tv);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_measure) {
            startMeasure();
        }
    }

    private void startMeasure() {
        String str = et.getText().toString().trim();
        if (TextUtils.isEmpty(str)) {
            return;
        }

        Button item = new Button(this);
        item.setText(str);

        // 第一个参数为限定值，AT_MOST 指定item的width 最大不能超过第一个参数指定的值;
        int width1 = View.MeasureSpec.makeMeasureSpec(getWindow().getDecorView().getWidth(), View.MeasureSpec.AT_MOST);
        int height1 = View.MeasureSpec.makeMeasureSpec((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 35, getResources().getDisplayMetrics()), View.MeasureSpec.EXACTLY);
        item.measure(width1, height1);
        int measuredWidth = item.getMeasuredWidth();

        tv.setText("with->"+measuredWidth + ";height->"+item.getMeasuredHeight());
    }
}
