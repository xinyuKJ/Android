package com.xinyu.haoshibang.fourth_FactoryPattern;

/**
 * Created by dzf on 16/12/13.
 */

public class ConcreateFactory extends Factory {
//    @Override   普通工厂
//    public Product createProduct() {
//        return new ConcreateProductA();
//    }

    /**
     * 反射工厂方法
     *
     * @param clz
     * @param <T>
     * @return
     */
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product p = null;
        try {
            p = (Product) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) p;
    }

}
