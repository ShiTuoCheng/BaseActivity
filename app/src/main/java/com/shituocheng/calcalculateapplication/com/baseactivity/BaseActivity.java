package com.shituocheng.calcalculateapplication.com.baseactivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by shituocheng on 2016/11/19.
 */

public abstract class BaseActivity extends AppCompatActivity {

    private View mContentView = null;

    protected final String TAG = this.getClass().getName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContentView = LayoutInflater.from(this).inflate(bindLayout(), null);
        setContentView(mContentView);
        initView();
    }

    //绑定layout
    public abstract int bindLayout();

    //初始化view
    public abstract void initView();

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    //不携带数据跳转activity
    public void startActivity(Class<?> clz){

        startActivity(clz);
    }

    //重载携带数据跳转的activity
    public void startActivity(Class<?> clz, Bundle bundle){

        Intent intent = new Intent();
        intent.setClass(this, clz);

        if (bundle != null){
            intent.putExtras(bundle);
        }

        startActivity(intent);
    }

    //返回数据
    public void startActivityForResult(Class<?> cls, Bundle bundle,
                                       int requestCode) {
        Intent intent = new Intent();
        intent.setClass(this, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivityForResult(intent, requestCode);
    }

    //设置shortcuts
    public void setShortcuts(){
        //判断当前API为25
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1){

        }
    }
}
