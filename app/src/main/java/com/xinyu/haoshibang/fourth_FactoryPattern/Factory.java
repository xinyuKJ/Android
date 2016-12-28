package com.xinyu.haoshibang.fourth_FactoryPattern;

/**
 * Created by dzf on 16/12/13.
 */

public abstract class Factory {
    /**
     * 工厂类的抽象方法  普通工厂
     */
//    public abstract Product createProduct();

    /**
     * 反射工厂
     */
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
