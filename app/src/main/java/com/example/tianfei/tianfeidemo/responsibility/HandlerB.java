package com.example.tianfei.tianfeidemo.responsibility;

import android.util.Log;

import com.example.tianfei.tianfeidemo.Input;
import com.example.tianfei.tianfeidemo.Output;

public class HandlerB implements IHandler<Input, Output>{


    @Override
    public Output handle(Input input) {
        Log.e("TIANFEI","HandlerB 处理完毕");

        return new Output("HandlerB处理过了");
    }

    @Override
    public boolean canHandle(Input input) {
        Log.e("TIANFEI","HandlerB 能处理");
        return true;
    }
}
