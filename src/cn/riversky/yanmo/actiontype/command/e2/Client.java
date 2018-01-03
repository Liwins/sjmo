package cn.riversky.yanmo.actiontype.command.e2;

/**
 * 主板开机的背景，这里应用命令模式。
 * invoker-->Box;拥有命令(set方式传入),拥有开机按钮命令
 * command:定义execute接口
 * ConcreteCommand->OpenCommand：实现command接口，并且具有Receive（MainBoardApi）引用-》构造传入。
 * Receive->MainBoardApi（这里采用接口方式-》接收者类型比较多）技嘉和微星两个实现
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 创建什么样的Receive实现类，就有什么样的开机方式
         */
//        Mainoard mainBoard=new GigaMainBoard();
        MainBoard mainBoard=new MsiMainBoard();
        Command command=new OpenCommand(mainBoard);
        Box box=new Box();
        box.setCommand(command);
        box.kaiJi();
    }
}
