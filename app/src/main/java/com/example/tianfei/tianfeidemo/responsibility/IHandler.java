package com.example.tianfei.tianfeidemo.responsibility;

public interface IHandler<INPUT, OUTPUT> {
    /**
     * @param input 输入
     * @return 处理结果
     */
    OUTPUT handle(INPUT input);

    /**
     * 是否处理
     *
     * @param input 输入
     * @return  true:后续Handle收不到 false:后续Handle可继续处理
     */
    boolean canHandle(INPUT input);
}
