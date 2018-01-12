package cn.riversky.gitbook.action.interpreter.e2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 表达式节点类：非终结符表达式
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/8.
 */
public class ExpressionNode extends AbstractNode {
    private ArrayList<AbstractNode> list=new ArrayList<>();

    @Override
    public void interpret(ContextString context) {
        //循环处理Context的标记
        while (true){
            if(context.currentToken()==null) {
                break;
            }else if(context.currentToken().equalsIgnoreCase("end")){
                context.skipToken("end");
                break;
            }else {
                AbstractNode node=new CommandNode();
                node.interpret(context);
                list.add(node);
            }
        }
    }

    /**
     * 循环执行命令集合中的每一条命令
     */
    @Override
    public void execute() {
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            ((AbstractNode)iterator.next()).execute();
        }
    }
}
