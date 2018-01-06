package cn.riversky.gitbook.Structtype.decorator.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public class Client {
    public static void main(String[] args) {
        String data="abc";
//        System.out.println((int) data.toCharArray()[1]);
        Encycle encycle=new StringMin();
        System.out.println(encycle.encode(data));
        System.out.println(new InverseString(new StringMin()).encode(data));
        System.out.println(new YiString(new InverseString(new StringMin())).encode(data));
        System.out.println(new ModString(new YiString(new InverseString(new StringMin()))).encode(data));
    }
}
