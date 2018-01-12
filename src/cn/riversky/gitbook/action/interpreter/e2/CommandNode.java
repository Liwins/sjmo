package cn.riversky.gitbook.action.interpreter.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/8.
 */
public class CommandNode extends AbstractNode {
    private AbstractNode node;
    @Override
    public void interpret(ContextString contextString) {
        if(contextString.currentToken().equalsIgnoreCase("loop")){
            node=new LoopCommandNode();
            node.interpret(contextString);
        }else{
            node=new PrimitiveCommandNode();
            node.interpret(contextString);
        }
    }

    @Override
    public void execute() {
        node.execute();
    }
}
