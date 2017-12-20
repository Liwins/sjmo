package cn.riversky.actiontype.strategy.e6;

/**
 * 与模版方法的结合
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public abstract class AbstractClass implements Strategy{
    @Override
    public void algorithmInterface() {
        stepOneOpe();
        stepTwoOpe();
        stepThreeOpe();
    }
    private void stepThreeOpe(){
        System.out.println("通用          第3步骤");
    }
    protected abstract void stepOneOpe();
    protected abstract void stepTwoOpe();
}
