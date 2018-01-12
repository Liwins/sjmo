package cn.riversky.gitbook.action.interpreter.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/8.
 */
public class DistanceNode extends AbstractNode{
    String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    @Override
    public String interpret() {
        return this.distance;
    }
}