package cn.riversky.yanmo.structtype.facade.e4.service;

/**
 * Created by admin on 2017/12/8.
 */
public interface Bapi {
    //提供给子系统外部使用
    public void a1();

    //提供给同一个子系统中，不同的模块使用，比如给B模块，给C模块
    public void a2();
    public void a3();
}
