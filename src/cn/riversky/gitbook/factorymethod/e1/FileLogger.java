package cn.riversky.gitbook.factorymethod.e1;

/**
 * 数据库日志记录器：具体产品
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public class FileLogger implements Logger{

    @Override
    public void writeLog() {
        System.out.println("日志记录。");
    }
}
