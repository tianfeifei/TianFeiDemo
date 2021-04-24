package com.example.tianfei.tianfeidemo.intercepter;

public interface IInterceptor<INPUT> {
    /**
     * @param input 输入
     * @return 是否拦截 true:后续拦截器收不到 false:后续拦截器可继续处理
     */
    boolean intercept(INPUT input);

}
