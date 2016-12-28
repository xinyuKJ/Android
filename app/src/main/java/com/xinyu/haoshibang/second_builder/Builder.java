package com.xinyu.haoshibang.second_builder;

/**
 * Created by dzf on 16/12/8.
 */
//抽象Builder
public abstract class Builder {

    public abstract void builcBoard(String board);//设置主机

    public abstract void buildDisplay(String display);//设置显示器

    public abstract void buildOS();//设置操作系统

    public abstract Computer create();//创建Computer

}
