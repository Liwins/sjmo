package cn.riversky.gitbook.Structtype.facade;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/5.
 */
public class CipherMachine {
    public String encrypt(String plainText){
        StringBuffer sb=new StringBuffer();
        for (char ch:plainText.toCharArray()){
            if(ch>'a'&&ch<'z'){
                sb.append((char)(ch%7+'a'));
            }
            if(ch>'A'&& ch<'Z'){
                sb.append((char)(ch%7+'A'));
            }else {
//                sb.append(ch);
                sb.append((char)(ch%7+'A'));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new CipherMachine().encrypt("hello,ihao ，你好"));
    }
}
