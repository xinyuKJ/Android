package com.xinyu.haoshibang.fifth_abstract_factory_pattern;

import com.xinyu.haoshibang.fifth_abstract_factory_pattern.module.DomesticEngine;
import com.xinyu.haoshibang.fifth_abstract_factory_pattern.module.IBrake;
import com.xinyu.haoshibang.fifth_abstract_factory_pattern.module.IEngine;
import com.xinyu.haoshibang.fifth_abstract_factory_pattern.module.ITire;
import com.xinyu.haoshibang.fifth_abstract_factory_pattern.module.NormalBrake;
import com.xinyu.haoshibang.fifth_abstract_factory_pattern.module.NormalTire;

/**
 * Created by dzf on 16/12/14.
 */

public class Q3Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}
