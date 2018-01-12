package cn.riversky.gitbook.action.interpreter.e1;

/**
 * 解析机器人指令：down run 10 and left move 20
 * 指令类设计
 * 叶子指令Direction Action Distance
 * 非叶子指令SentenceNode(direction,Action,Distance),AndNode(Sentence,Sentence)
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
        String instruction="up move 3 and down run 10 and left move 3";
        ContextHandler contextHandler=new ContextHandler();
        contextHandler.handle(instruction);
        System.out.println(contextHandler.output());
    }
}
