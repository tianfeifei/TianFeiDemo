package com.example.tianfei.tianfeidemo.intercepter;

import android.util.Log;

import com.example.tianfei.tianfeidemo.Input;

public class InterceptorA implements IInterceptor<Input>{

    public static final String TAG = "TIANFEI";

    @Override
    public boolean intercept(Input input) {
        input.input+="InterceptorA";
        Log.e(TAG,"InterceptorA处理了");
        return false;
    }
}
