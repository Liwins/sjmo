package cn.riversky.yanmo.actiontype.command.e3;

/**
 * 利用命令模式进行了细粒度的控制，具有开启和重启两个命令的机箱的命令方式
 * nvoke->Box:调用者具有两个命令选项（两个command接口），set方式传入，具有开机和重启两个按钮（open reset）
 * command：命令接口execute
 * Concrete->OpenCommand,ResetCommand,两个实现类分别代表开机和重启，具有receiver引用，通过构造传入。并实现execute方法（）
 * Receive->MainBoard:接口，定义主板的开机和重启方法。两个实现类分别实现。
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class Client {
    public static void main(String[] args) {
        MainBoard mainBoard=new MsiMainBoard();
//        MainBoard mainBoard=new GigaMainBoard();
        Command openComand=new OpenCommand(mainBoard);
        Command resetCommand=new ResetCommand(mainBoard);

        Box box=new Box();
        box.setOpenCommand(openComand);
        box.setResetCommand(resetCommand);
        box.openButton();
        box.reSetButton();
    }
}
