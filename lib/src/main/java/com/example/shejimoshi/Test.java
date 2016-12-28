package com.example.shejimoshi;

/**
 * Created by dzf on 16/12/8.
 */

public class Test {
    public static void main(String[] args) {
        //构建器
        Builder builder = new MacbookBuilder();
        //Director
        Director director = new Director(builder);
        director.construct("英特尔主板ad", "Retina显示器");
        //构建计算机,输出相关信息
        System.out.println("Computer Info:" + builder.create().toString());
    }
}
