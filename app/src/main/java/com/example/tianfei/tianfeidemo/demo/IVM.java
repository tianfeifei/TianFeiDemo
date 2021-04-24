package com.example.tianfei.tianfeidemo.demo;


public abstract class IVM<OUTPUT extends BlockDataWrapper> {

    public void setParser(IParser<? extends BlockDataWrapper, OUTPUT> parser) {
        this.parser = parser;
    }

    public IParser<? extends BlockDataWrapper, OUTPUT> getParser() {
        return parser;
    }

    IParser<? extends BlockDataWrapper, OUTPUT> parser;

    public abstract void setData(OUTPUT blockDataWrapper);
}
