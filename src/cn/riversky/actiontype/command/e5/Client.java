package cn.riversky.actiontype.command.e5;

import cn.riversky.actiontype.command.e5.command.ChopCommand;
import cn.riversky.actiontype.command.e5.command.Command;
import cn.riversky.actiontype.command.e5.command.DuckCommand;
import cn.riversky.actiontype.command.e5.command.PorkCommand;
import cn.riversky.actiontype.command.e5.invoker.Waiter;

/**
 * invoker->Waiter:调用者，这里需要common集合辅助（menuCommand）,构建命令集合（调用辅助的add）,orderDish(添加命令)，然后调用辅助的循环执行
 *          menuCommand，拥有集合引用<Command)，具有add方法添加，发方法调用（循环执行其中命令）
 * command:命令接口 execute
 * ConcreteCommand->ChopCommand,PorkCommand,DuckCommand:command实现类，分别具有receive接口引用，set传入
 * Receive->CookApi：Receive接口
 * receiveImpl->CoolCook,HotCook:实现receive接口
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class Client {
    public static void main(String[] args) {
        //只是负责向服务员点菜就好了
        //创建服务员
        Waiter waiter = new Waiter();

        //创建命令对象，就是要点的菜
        Command chop = new ChopCommand();
        Command duck = new DuckCommand();
        Command pork = new PorkCommand();

        //点菜，就是把这些菜让服务员记录下来
        waiter.orderDish(chop);
        waiter.orderDish(duck);
        waiter.orderDish(pork);

        //点菜完毕
        waiter.dealOrder();
    }
}
