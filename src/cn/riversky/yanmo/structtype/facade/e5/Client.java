package cn.riversky.yanmo.structtype.facade.e5;

import cn.riversky.yanmo.structtype.facade.e5.factory.FacadeApi;
import cn.riversky.yanmo.structtype.facade.e5.factory.FacadeFactory;

/**
 * 完整版的使用，使用工厂方法产生类。
 * 这里是对example3提供了，工厂类。
 * Created by admin on 2017/12/6.
 */
public class Client {
    public static void main(String[] args) {
        FacadeApi facadeApi=FacadeFactory.getFacateApi();
        facadeApi.generate();
    }
}
