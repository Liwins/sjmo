package cn.riversky.actiontype.command.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class Box {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void kaiJi(){
        command.execute();
    }
}
