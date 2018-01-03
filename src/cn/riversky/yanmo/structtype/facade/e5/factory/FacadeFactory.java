package cn.riversky.yanmo.structtype.facade.e5.factory;

/**
 * Created by admin on 2017/12/8.
 */
public class FacadeFactory {
    private FacadeFactory() {
    }
    public static FacadeApi getFacateApi(){
        return new Facade();
    }
}
