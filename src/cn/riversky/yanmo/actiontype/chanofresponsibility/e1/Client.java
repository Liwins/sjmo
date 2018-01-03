package cn.riversky.yanmo.actiontype.chanofresponsibility.e1;

/**
 * 不使用设计模式的if判断方式进行聚餐费用不同级别的处理
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public class Client {
    public static void main(String[] args) {
        FeeHandler feeHandler=new FeeHandler();
        //开始测试
        System.out.println(feeHandler.depManaegHandle("小李",300));
        System.out.println(feeHandler.depManaegHandle("小张",300));
        System.out.println(feeHandler.depManaegHandle("小李",600));
        System.out.println(feeHandler.depManaegHandle("小张",600));
        System.out.println(feeHandler.depManaegHandle("小李",1900));
        System.out.println(feeHandler.depManaegHandle("小张",1900));
    }
}
