package cn.riversky.yanmo.structtype.facade.e5.factory;

import cn.riversky.yanmo.structtype.facade.e5.gener.Bussiness;
import cn.riversky.yanmo.structtype.facade.e5.gener.Dao;
import cn.riversky.yanmo.structtype.facade.e5.gener.Service;

/**
 * Created by admin on 2017/12/8.
 */
public class Facade implements FacadeApi{
    public  void generate(){
        new Dao().generate();
        new Service().generate();
        new Bussiness().generate();
    }
}
