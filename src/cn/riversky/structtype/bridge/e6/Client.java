package cn.riversky.structtype.bridge.e6;

import cn.riversky.structtype.bridge.e6.base.MessageImplementor;
import cn.riversky.structtype.bridge.e6.base.impl.MessageEmail;
import cn.riversky.structtype.bridge.e6.base.impl.MessageMobile;
import cn.riversky.structtype.bridge.e6.service.AbstractMessage;
import cn.riversky.structtype.bridge.e6.service.create.CommonMessage;
import cn.riversky.structtype.bridge.e6.service.create.SpecialUrgencyMessage;
import cn.riversky.structtype.bridge.e6.service.create.UrgencyMessage;

/**
 * 这里从两个维度进行拆分，将接口和实现分离
 * 分离：
 * 通信工具扩展，实现通信工具的基本接口即可MessageImplementor
 * 信息方式的扩展，这里通过定义抽象基本类做句柄来操作（抽象基本类中具有基本接口），然后将不同的信息方式进行实现该抽象类（覆盖要修改的方法）
 * Created by admin on 2017/12/5.
 */
public class Client {
    public static void main(String[] args) {
        //创建具体的基本的实现类
        MessageImplementor implementor=new MessageEmail();
        //普通的消息
        AbstractMessage m=new CommonMessage(implementor);
        m.sendMessage("来取文件","小李");
        //加急消息
        m=new UrgencyMessage(implementor);
        m.sendMessage("来取文件","小李");
        //特急消息
        m=new SpecialUrgencyMessage(implementor);
        m.sendMessage("来取文件","小李");
        MessageImplementor implementor1=new MessageMobile();

        m=new UrgencyMessage(implementor1);
        m.sendMessage("来取文件","小李");

    }
}
