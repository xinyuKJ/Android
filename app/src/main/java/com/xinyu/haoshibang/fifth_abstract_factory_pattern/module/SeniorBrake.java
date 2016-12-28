package com.xinyu.haoshibang.fifth_abstract_factory_pattern.module;

/**
 * Created by dzf on 16/12/14.
 */

public class SeniorBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}
