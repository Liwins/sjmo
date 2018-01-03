package cn.riversky.yanmo.actiontype.templatemethod.e3;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/19.
 */
public class Client {


    public static void main(String[] args) {
        AbstractClass abstractClass=new ConcreteClass();
        abstractClass.templateMethod();
    }
}
