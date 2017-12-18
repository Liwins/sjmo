package cn.riversky.actiontype.command.e4;

/**
 * 这是个invoker,仅仅包含加减两种命令的调用者
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class Calculator2 {
    private Command addCmd=null;
    private Command substractCmd=null;

    public void setAddCmd(Command addCmd) {
        this.addCmd = addCmd;
    }

    public void setSubstractCmd(Command substractCmd) {
        this.substractCmd = substractCmd;
    }
    public void addPressed(){
        addCmd.execute();
    }
    public void substractPress(){
        substractCmd.execute();
    }
}
