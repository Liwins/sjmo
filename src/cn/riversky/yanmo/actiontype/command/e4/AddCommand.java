package cn.riversky.yanmo.actiontype.command.e4;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class AddCommand implements Command {
    private OperationApi operationApi;
    private int operateNum;

    public AddCommand(OperationApi operationApi, int operateNum) {
        this.operationApi = operationApi;
        this.operateNum = operateNum;
    }

    @Override
    public void execute() {
        operationApi.add(operateNum);
    }

    @Override
    public void undo() {
        operationApi.substract(operateNum);
    }
}
