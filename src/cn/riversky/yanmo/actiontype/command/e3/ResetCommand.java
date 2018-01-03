package cn.riversky.yanmo.actiontype.command.e3;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class ResetCommand implements Command {
    private MainBoard mainBoard;

    public ResetCommand(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public void execute() {
        mainBoard.resetComputer();
    }
}
