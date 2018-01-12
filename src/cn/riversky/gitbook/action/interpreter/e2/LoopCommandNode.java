package cn.riversky.gitbook.action.interpreter.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/8.
 */
public class LoopCommandNode extends AbstractNode {
    /**
     * 循环次数以及循环语句中的表达式
     */
    private int number;
    private AbstractNode commandNode;

    /**
     * 解释循环命令
     * @param contextString
     */
    @Override
    public void interpret(ContextString contextString) {
        contextString.skipToken("LOOP");
        number=contextString.currentNumber();
        contextString.nextToken();
        //循环语句中的表达式
        commandNode=new ExpressionNode();
        commandNode.interpret(contextString);
    }

    @Override
    public void execute() {
        for(int i=0;i<number;i++){
            commandNode.execute();
        }

    }
}
