package com.caizenghui.saveinstance;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by caizenghui on 16/6/17.
 */
public class CustomerTextView extends LinearLayout {
    public CustomerTextView(Context context) {
        super(context);
        initView();
    }

    private void initView() {
        LayoutInflater.from(getContext()).inflate(R.layout.costomer_text_view, this);
    }

}
