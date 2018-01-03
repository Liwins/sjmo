package cn.riversky.gitbook.factorymethod.e1;

/**
 * 工厂方法设计模式，需要独立设计一套工厂方法的接口和对应的（一对一）实例生成方法
 * 1改进方式，将工厂接口修改成工厂抽象类，并且实现方法调用（业务实现），类的生成延迟到子类中
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public class Client {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    private static void demo2() {
        LoggerFactory factory= (LoggerFactory) XMLUtil.getBean();
        factory.writeLogger();
    }

    private static void demo1() {
        LoggerFactory loggerFactory=new DatabaseLoggerFactory();
        Logger logger=loggerFactory.createLogger();
        logger.writeLog();
    }
}
