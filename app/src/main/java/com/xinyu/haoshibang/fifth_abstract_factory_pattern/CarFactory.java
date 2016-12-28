package com.xinyu.haoshibang.fifth_abstract_factory_pattern;

import com.xinyu.haoshibang.fifth_abstract_factory_pattern.module.IBrake;
import com.xinyu.haoshibang.fifth_abstract_factory_pattern.module.IEngine;
import com.xinyu.haoshibang.fifth_abstract_factory_pattern.module.ITire;

/**
 * Created by dzf on 16/12/14.
 */

public abstract class CarFactory {
    /**
     * 生产轮胎
     *
     * @return
     */
    public abstract ITire createTire();


    /**
     * 生产发动机
     *
     * @return
     */
    public abstract IEngine createEngine();


    /**
     * 生产制动系统
     *
     * @return
     */
    public abstract IBrake createBrake();
}
