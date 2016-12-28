package com.xinyu.haoshibang.fourth_FactoryPattern;

/**
 * Created by dzf on 16/12/13.
 */

public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreateFactory();
//        Product product = factory.createProduct();
        Product product = factory.createProduct(ConcreateProductB.class);
        product.method();
    }
}
