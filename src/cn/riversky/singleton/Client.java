package cn.riversky.singleton;

import cn.riversky.singleton.mutithread.EnumSingle;

/**
 * Created by admin on 2017/12/1.
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {

            EnumSingle.uniqueInstance.singletonOperation();
        }
    }
}
