package cn.riversky.bridge.e5;

import cn.riversky.bridge.e5.service.AbsractionIm;
import cn.riversky.bridge.e5.service.Abstraction;
import cn.riversky.bridge.e5.service.interfac.Implementor;
import cn.riversky.bridge.e5.service.interfac.impl.ConcreateImplA;

/**
 * 这里桥模式，就是实现和接口进行分离，有像抽象工厂
 * Created by admin on 2017/12/5.
 */
public class Client {
    public static void main(String[] args) {
        Implementor implA = new ConcreateImplA();
        Abstraction abstraction = new AbsractionIm(implA);
        abstraction.operation();
    }
}
