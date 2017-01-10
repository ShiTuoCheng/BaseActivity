package com.shituocheng.calcalculateapplication.com.baseactivity;

import android.view.GestureDetector;
import android.view.MotionEvent;

/**
 * Created by shituocheng on 2017/1/10.
 */

public class TapListener extends GestureDetector.SimpleOnGestureListener {
    private OnDoubleTapListener mDoubleTapListener;
    public TapListener(OnDoubleTapListener onDoubleTapListener) {
        mDoubleTapListener = onDoubleTapListener;
    }
    public interface OnDoubleTapListener {
        void onDouble();
    }
    @Override
    public boolean onDoubleTap(MotionEvent e) {
        mDoubleTapListener.onDouble();
        return true;
    }
}