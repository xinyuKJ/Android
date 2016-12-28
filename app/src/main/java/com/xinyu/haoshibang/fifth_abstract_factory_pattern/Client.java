package com.xinyu.haoshibang.fifth_abstract_factory_pattern;

import com.xinyu.haoshibang.fifth_abstract_factory_pattern.CarFactory;
import com.xinyu.haoshibang.fifth_abstract_factory_pattern.Q3Factory;
import com.xinyu.haoshibang.fifth_abstract_factory_pattern.Q7Factory;

/**
 * Created by dzf on 16/12/14.
 */

public class Client {

    public static void main(String[] args) {
        CarFactory q3 = new Q3Factory();


        q3.createTire().tire();
        q3.createEngine().engine();
        q3.createBrake().brake();

        System.out.println("-------------------");

        CarFactory q7 = new Q7Factory();

        q7.createTire().tire();
        q7.createEngine().engine();
        q7.createBrake().brake();

    }
}
