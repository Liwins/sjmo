package cn.riversky.gitbook.action.interpreter.e2;

import java.util.StringTokenizer;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/8.
 */
public class ContextString {
    private StringTokenizer tokenizer;
    private String currentToken;

    public ContextString(String  text) {
        this.tokenizer = new StringTokenizer(text);
        nextToken();
    }

    public String nextToken() {
        if(tokenizer.hasMoreElements()){
            currentToken=tokenizer.nextToken();
        }
        else {
            currentToken=null;
        }
        return currentToken;
    }

    /**
     * 返回当前标记
     * @return
     */
    public String currentToken(){
        return currentToken;
    }
    /**
     * 跳过一个标记
     * @param token
     */
    public void skipToken(String token){
        if(!token.equalsIgnoreCase(currentToken)){
            System.out.println("错误提示："+currentToken+"解释错误！");
        }
        nextToken();
    }
    /**
     * 如果当前标记是一个数字，则返回对应的数值
     * @return
     */
    public int currentNumber(){
        int number=0;
        try {

            number=Integer.parseInt(currentToken);
        }catch (NumberFormatException e){
            System.err.println("错误提示："+e);
        }
        return number;
    }

}
