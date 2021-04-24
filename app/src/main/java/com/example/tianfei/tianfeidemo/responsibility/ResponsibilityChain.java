package com.example.tianfei.tianfeidemo.responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * 责任链模式
 * 使用场景：
 * - 避免if-else;
 * - 只有一个handler处理
 */
public class ResponsibilityChain<INPUT, OUTPUT> {
    final List<IHandler<INPUT, OUTPUT>> mHandlers = new ArrayList<>();


    public ResponsibilityChain<INPUT, OUTPUT> addHandler(IHandler<INPUT, OUTPUT> handler) {
        if (handler == null) {
            return this;
        }
        mHandlers.add(handler);
        return this;
    }

    public OUTPUT process(INPUT input) {
        for (IHandler<INPUT, OUTPUT> handler : mHandlers) {
            if (handler.canHandle(input)) {
                return handler.handle(input);
            }
        }
        return null;
    }

}
