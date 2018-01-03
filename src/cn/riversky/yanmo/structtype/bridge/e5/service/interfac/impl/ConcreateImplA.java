package cn.riversky.yanmo.structtype.bridge.e5.service.interfac.impl;

import cn.riversky.yanmo.structtype.bridge.e5.service.interfac.Implementor;

/**
 * Created by admin on 2017/12/5.
 */
public class ConcreateImplA implements Implementor {
    @Override
    public void oprationImpl() {
        System.out.println("ConcreateImplA.oprationImpl()");
    }
}
