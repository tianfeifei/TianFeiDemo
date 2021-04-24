package com.example.tianfei.tianfeidemo.intercepter;

import java.util.ArrayList;
import java.util.List;

/**
 * 拦截器模式
 * 使用场景：
 * - 让每个拦截器都处理输入;
 * - 只有一个handler处理
 */
public class InterceptorChain<INPUT> {
    final List<IInterceptor<INPUT>> mInterceptors = new ArrayList<>();

    public InterceptorChain<INPUT> addInterceptor(IInterceptor<INPUT> interceptor) {
        if (interceptor == null) {
            return this;
        }
        mInterceptors.add(interceptor);
        return this;
    }
    public void process(INPUT input) {

        for (IInterceptor<INPUT> interceptor : mInterceptors) {
            if (interceptor.intercept(input)) {
                break;
            }
        }
    }
}
