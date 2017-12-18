package cn.riversky.actiontype.command.e4;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class Operate implements OperationApi{

    private int result;

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public void add(int num) {
        result+=num;
    }

    @Override
    public void substract(int num) {
        result-=num;
    }
}
