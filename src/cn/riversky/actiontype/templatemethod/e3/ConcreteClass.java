package cn.riversky.actiontype.templatemethod.e3;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/19.
 */
public class ConcreteClass extends AbstractClass{

    @Override
    protected void twoStep() {
        System.out.println("第二步骤");
    }

    @Override
    protected void oneStep() {
        System.out.println("第一步骤");
    }
}
