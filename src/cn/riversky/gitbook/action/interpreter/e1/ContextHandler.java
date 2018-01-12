package cn.riversky.gitbook.action.interpreter.e1;

import java.util.Stack;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/8.
 */
public class ContextHandler {
    private String instruction;
    private AbstractNode node;
    /**
     * 负责解析
     * @param instruction
     */
    public void handle(String instruction){
        AbstractNode left=null,right=null;
        AbstractNode direction=null,action=null,distance=null;
        Stack stack=new Stack();
        String[] words=instruction.split(" ");
        for(int i=0;i<words.length;i++){
            if("and".equalsIgnoreCase(words[i])){
                left= (AbstractNode) stack.pop();
                String word1=words[++i];
                String word2=words[++i];
                String word3=words[++i];
                direction =new DirectionNode(word1);
                action=new ActionNode(word2);
                distance=new DistanceNode(word3);
                right=new SentenceNode(direction,action,distance);
                stack.push(new AndNode(left,right));
            }else {
                String word1=words[i];
                String word2=words[++i];
                String word3=words[++i];
                direction =new DirectionNode(word1);
                action=new ActionNode(word2);
                distance=new DistanceNode(word3);
                left=new SentenceNode(direction,action,distance);
                stack.push(left);
            }


        }
        this.node= (AbstractNode) stack.pop();
    }
    public  String output(){
        String result=node.interpret();
        return result;
    }
}
