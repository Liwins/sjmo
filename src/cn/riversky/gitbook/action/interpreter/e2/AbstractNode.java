package cn.riversky.gitbook.action.interpreter.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/8.
 */
public  abstract class AbstractNode {
    public abstract  void interpret(ContextString contextString);
    public abstract  void execute();
}
