package cn.riversky.facade.e3;

/**
 * 采用门面模式的门面类，将大量集成的测试统一处理。感觉有点像Builder模式（只不过是为生成类的方式统一简化）
 * Created by admin on 2017/12/6.
 */
public class Client {
    public static void main(String[] args) {
        Facade.generate();
    }
}
