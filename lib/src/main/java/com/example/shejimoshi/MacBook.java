package com.example.shejimoshi;

/**
 * Created by dzf on 16/12/8.
 */
//具体的Computer类
public class MacBook extends Computer {
    protected MacBook() {
    }

    @Override
    public void setmOS() {
        mOS = "Mac OS X 10.10";
    }
}
