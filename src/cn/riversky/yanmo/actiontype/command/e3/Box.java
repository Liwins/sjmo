package cn.riversky.yanmo.actiontype.command.e3;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class Box {
    private Command openCommand;
    private Command resetCommand;

    public void setOpenCommand(Command openCommand) {
        this.openCommand = openCommand;
    }

    public void setResetCommand(Command resetCommand) {
        this.resetCommand = resetCommand;
    }
    public void openButton(){
        openCommand.execute();
    }
    public  void reSetButton(){
        resetCommand.execute();
    }
}
