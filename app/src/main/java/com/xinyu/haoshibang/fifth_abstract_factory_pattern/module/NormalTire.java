package com.xinyu.haoshibang.fifth_abstract_factory_pattern.module;

/**
 * Created by dzf on 16/12/14.
 */

public class NormalTire implements ITire {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
