package cn.riversky.structtype.bridge.e7;

import cn.riversky.structtype.bridge.e7.bridge.AbstractMessage;
import cn.riversky.structtype.bridge.e7.bridge.type.CommonMessage;
import cn.riversky.structtype.bridge.e7.bridge.type.SpecialUrgencyMessage;

/**
 * 简化桥接
 * 桥接模式的复用方式，通过重新构建桥包，使用一个基本抽象类（组合进需要被桥的接口），然后定义抽象方法。（具体的方式在抽象实现类中进行实现）
 * Created by admin on 2017/12/5.
 */
public class Client {
    public static void main(String[] args) {
        String user="小明";
        String message="拿材料";
        AbstractMessage m=new CommonMessage(1);
        m.sendMessage(message,user);
        m=new CommonMessage(3);
        m.sendMessage(message,user);
        m=new SpecialUrgencyMessage(2);
        m.sendMessage(message,user);

    }
}
