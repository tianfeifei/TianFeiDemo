package com.example.tianfei.tianfeidemo.responsibility;
import android.util.Log;
import com.example.tianfei.tianfeidemo.Input;
import com.example.tianfei.tianfeidemo.Output;

public class HandlerA implements IHandler<Input, Output> {
    @Override
    public Output handle(Input input) {
        Log.e("TIANFEI", "HandlerA 处理完毕");

        return new Output("HandlerA处理过了");
    }

    @Override
    public boolean canHandle(Input input) {
        Log.e("TIANFEI", "HandlerA 不能处理");
        return false;
    }
}
