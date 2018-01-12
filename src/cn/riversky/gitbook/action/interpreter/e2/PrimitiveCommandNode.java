package cn.riversky.gitbook.action.interpreter.e2;

/**
 * 终结符表达式
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/8.
 */
public class PrimitiveCommandNode extends AbstractNode {
    private String name;
    private String text;

    @Override
    public void interpret(ContextString contextString) {
        name=contextString.currentToken();
        contextString.skipToken(name);
        if(!name.equalsIgnoreCase("print") &&!name.equalsIgnoreCase("break")&&!name.equalsIgnoreCase("space")){
            System.err.println("非法命令！");
        }
        if(name.equalsIgnoreCase("print")){
            text=contextString.currentToken();
            contextString.nextToken();
        }
    }

    @Override
    public void execute() {
        if(name.equalsIgnoreCase("print")){
            System.out.print(text);
        }else if(name.equalsIgnoreCase("space")){
            System.out.print(" ");
        }else if(name.equalsIgnoreCase("break")){
            System.out.println();
        }
    }
}
