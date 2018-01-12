package cn.riversky.gitbook.action.interpreter.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/8.
 */
public class AndNode extends AbstractNode {
    /**
     * 分别代表左右表达式
     */
    private AbstractNode left;
    private AbstractNode right;

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String interpret() {
        return left.interpret()+"再" +right.interpret();
    }
}
