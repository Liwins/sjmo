package cn.riversky.yanmo.actiontype.command.e1;

/**
 * 基本的设计思想
 * invoker 调用者持有命令对象（setter传入）,定义runcommand方法
 * receiver 命令接受者：定义自己的处理方式
 * command  命令接口
 * concreateCommand 命令的实现类，持有接受者对象（构造传入），在实现的接口方法中（调用接受者的执行方法）
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 创建接受者（真正处理业务者）
         */
        Receiver receiver=new Receiver();
        /**
         * 创建命令对象
         */
        Command command=new ConcreteCommand(receiver);
        /**
         * 类似门面模式的对外提供服务者，不过这里需要自己组装（在ConcreteCommand进行业务组合）
         */
        Invoker invoker=new Invoker();
        invoker.setCommand(command);
        /**
         * 调用者进行调用
         */
        invoker.runCommond();
    }

}
