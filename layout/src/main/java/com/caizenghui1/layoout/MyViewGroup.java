package com.caizenghui1.layoout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by caizenghui on 16/7/5.
 */
public class MyViewGroup extends ViewGroup {
    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        measureChild(getChildAt(0), widthMeasureSpec, heightMeasureSpec);
        Log.d("Layout", "onMeasure-->" + this);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        View view = getChildAt(0);

        view.layout(0, 0, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
        Log.d("Layout", "onLayout-->" + this);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("Layout", "onDraw-->" + this);
    }
}
