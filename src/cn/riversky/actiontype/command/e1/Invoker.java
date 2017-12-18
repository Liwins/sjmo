package cn.riversky.actiontype.command.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class Invoker {
    private Command command=null;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void runCommond(){
        command.doCommand();
    }
}
