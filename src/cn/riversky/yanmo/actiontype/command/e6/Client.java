package cn.riversky.yanmo.actiontype.command.e6;

/**
 * 架构：带有命令接收者和调用这的信息的命令模式
 * Command:将invoker的设置接口(setInvoker)，执行接口(execute())，调用者的编号获取（getid）
 * CommandImpl->ChopCommand,DuckCommand：命令实现类，1具有Invoker对象，set传入。2 id属性（构造传入），get方法3实现execute
 * Receive->cookapi:定义业务接口
 * receiveImpl->HotCook:1name属性（构造传入）2实现业务接口3runnable接口实现，命令队列取命令执行（使用拉模型）
 *           CommandQueue（命令队列）：作为队列（list）存放命令1属性命令队列2同步菜单（取出菜单中的命令放到队列）3receive的getOneCommond接口
 *Invoker->Waiter:调用器具
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class Client {
    public static void main(String[] args) {

    }
}
