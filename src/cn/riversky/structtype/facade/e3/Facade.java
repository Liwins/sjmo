package cn.riversky.structtype.facade.e3;

import cn.riversky.structtype.facade.e3.gener.Bussiness;
import cn.riversky.structtype.facade.e3.gener.Dao;
import cn.riversky.structtype.facade.e3.gener.Service;

/**
 * Created by admin on 2017/12/8.
 */
public class Facade {
    public static void generate(){
        new Dao().generate();
        new Service().generate();
        new Bussiness().generate();
    }
}
