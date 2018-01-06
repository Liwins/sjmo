package cn.riversky.gitbook.creatType.sigleton.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
