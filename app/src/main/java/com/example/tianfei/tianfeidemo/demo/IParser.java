package com.example.tianfei.tianfeidemo.demo;


public interface IParser<INPUT extends BlockDataWrapper, OUTPUT extends BlockDataWrapper> {

    class DefaultParser implements IParser<BlockDataWrapper, BlockDataWrapper> {

        @Override
        public BlockDataWrapper parse(BlockDataWrapper input) {
            return input;
        }
    }


    OUTPUT parse(INPUT input);

}
