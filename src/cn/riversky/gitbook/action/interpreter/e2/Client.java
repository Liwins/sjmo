package cn.riversky.gitbook.action.interpreter.e2;

/**
 * loop 2 print 杨过 space space print 小龙女  break end print 郭靖 space space print 黄蓉
 * 解析上面的为
 * 杨过  小龙女
 * 杨过  小龙女
 * 郭竞  黄蓉
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/8.
 */
public class Client {
    public static void main(String[] args) {
//        String text="LOOP 2 print 杨过 space space print 小龙女 break print hello break end" +
//                " LOOP 2 print 杨1过 space space print 小1龙女 break print hello1 break end";
        String text="LOOP 2 LOOP 2 print 杨过 space space print 小明 break end print 小龙女 break end";
        ContextString context=new ContextString(text);
        AbstractNode node=new ExpressionNode();
        node.interpret(context);
        node.execute();

    }
}
