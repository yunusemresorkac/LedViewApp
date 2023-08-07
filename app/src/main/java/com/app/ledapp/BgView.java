package com.app.ledapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


public class BgView extends View {
    private static final int PIXEL_SIZE =10;
    private Paint mPaint;

    public BgView(Context context) {
        this(context, null);
    }

    public BgView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BgView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();

        int rowCount = height / PIXEL_SIZE;
        int columnCount = width / PIXEL_SIZE;

        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                int left = column * PIXEL_SIZE;
                int top = row * PIXEL_SIZE;
                int right = left + PIXEL_SIZE;
                int bottom = top + PIXEL_SIZE;

                if ((row + column) % 2 == 0) {
                    mPaint.setColor(Color.BLACK);
                } else {
                    mPaint.setColor(Color.GREEN);
                }

                canvas.drawRect(left, top, right, bottom, mPaint);
            }
        }
    }
}