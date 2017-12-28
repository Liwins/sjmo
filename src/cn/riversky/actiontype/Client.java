package cn.riversky.actiontype;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public class Client {
    public static void main(String[] args) {
       diao();
    }
    public static void diao(){
        System.out.println(Thread.currentThread().getName());
    }
}
