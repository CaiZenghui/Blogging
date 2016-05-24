package com.caizenghui.edittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputType;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

public class EditTextMainActivity extends AppCompatActivity {

    private int money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_main);
        final EditText et = (EditText) findViewById(R.id.et);

        et.setBackgroundResource(0);
        et.setHint("请输入整数且在0-1000元之间的金额");
        et.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        et.setInputType(InputType.TYPE_CLASS_NUMBER);
        et.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            public void afterTextChanged(Editable s) {
                if ("0".equals(s.toString().trim())){
                    et.post(new Runnable() {
                        @Override
                        public void run() {
                            et.setText("");
                        }
                    });
                    money=-1;
                    return;
                }
                money = Integer.parseInt(TextUtils.isEmpty(et.getText().toString().trim()) ? "-1" : et.getText().toString().trim());
                Log.d("EditTextMainActivity", money + "");
            }
        });
        et.setFilters(new InputFilter[]{
                new InputFilter.LengthFilter(3)
        });
        int padding = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 8, getResources().getDisplayMetrics());
        et.setPadding(padding, padding, padding, padding);
        ViewGroup.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        et.setLayoutParams(params);
    }
}
