package com.example.tianfei.tianfeidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.tianfei.tianfeidemo.demo.BlockDataWrapper;
import com.example.tianfei.tianfeidemo.demo.SimplerPlayerDataWrapper;
import com.example.tianfei.tianfeidemo.demo.IParser;
import com.example.tianfei.tianfeidemo.demo.IVM;
import com.example.tianfei.tianfeidemo.demo.Parser1;
import com.example.tianfei.tianfeidemo.demo.VM;
import com.example.tianfei.tianfeidemo.intercepter.InterceptorA;
import com.example.tianfei.tianfeidemo.intercepter.InterceptorB;
import com.example.tianfei.tianfeidemo.intercepter.InterceptorChain;
import com.example.tianfei.tianfeidemo.responsibility.HandlerA;
import com.example.tianfei.tianfeidemo.responsibility.HandlerB;
import com.example.tianfei.tianfeidemo.responsibility.ResponsibilityChain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VM vm = new VM();
        Parser1 parser1 = new Parser1();
        vm.setParser(parser1);
//
//
        //setData时去分发数据
        setData时去分发数据(vm);
    }

    private void setData时去分发数据(IVM vm) {
        IParser parser = vm.getParser();
        BlockDataWrapper blockDataWrapper = parser.parse(new SimplerPlayerDataWrapper());
        vm.setData(blockDataWrapper);
    }


    private void 责任链demo() {
        //拦截器模式
        InterceptorChain<Input> processChain = new InterceptorChain<>();
        processChain.addInterceptor(new InterceptorA());
        processChain.addInterceptor(new InterceptorB());
        Input input = new Input("初始值");
        processChain.process(input);
        Log.e(InterceptorA.TAG, "输入=" + input.input);
        Log.e(InterceptorA.TAG, "---------------------------------------");

        //责任链模式
        ResponsibilityChain<Input, Output> chain = new ResponsibilityChain<>();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        Output output = chain.process(new Input("责任链初始值"));
        Log.e(InterceptorA.TAG, "输出=" + output.out);
    }
}
