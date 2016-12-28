package com.xinyu.haoshibang.fifth_abstract_factory_pattern;

import android.media.MediaPlayer;
import android.widget.MediaController;

import com.xinyu.haoshibang.fifth_abstract_factory_pattern.module.DomesticEngine;
import com.xinyu.haoshibang.fifth_abstract_factory_pattern.module.IBrake;
import com.xinyu.haoshibang.fifth_abstract_factory_pattern.module.IEngine;
import com.xinyu.haoshibang.fifth_abstract_factory_pattern.module.ITire;
import com.xinyu.haoshibang.fifth_abstract_factory_pattern.module.ImportEngine;
import com.xinyu.haoshibang.fifth_abstract_factory_pattern.module.NormalBrake;
import com.xinyu.haoshibang.fifth_abstract_factory_pattern.module.NormalTire;
import com.xinyu.haoshibang.fifth_abstract_factory_pattern.module.SUVTire;
import com.xinyu.haoshibang.fifth_abstract_factory_pattern.module.SeniorBrake;

/**
 * Created by dzf on 16/12/14.
 */

public class Q7Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake createBrake(){
        MediaPlayer mediaPlayer=null;
        return new SeniorBrake();

    }
}
