package com.xinyu.haoshibang.second_builder;

/**
 * Created by dzf on 16/12/8.
 */
//Director类,负责构造Computer
public class Director {
    Builder mBuilder = null;

    public Director(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    /**
     * 构建对象
     * @param board
     * @param display
     */
    public void construct(String board,String display){
        mBuilder.builcBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
