package cn.riversky.structtype.facade.e2;

/**
 * 这种方式，通过Facade提供对外服务，完成全部的测试代码，使用者不需要知道测试了什么
 * Created by admin on 2017/12/6.
 */
public class Client {
    public static void main(String[] args) {
            new Facade().test();
    }
}
