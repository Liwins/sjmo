package cn.riversky.yanmo.actiontype.command.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class OpenCommand implements Command {
    private MainBoard mainBoard=null;

    public OpenCommand(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public void execute() {
        mainBoard.openComputer();
    }
}
