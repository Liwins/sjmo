package cn.riversky.gitbook.creatType.sigleton.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public abstract class LoggerFactory {
    public void writeLogger() {
        Logger logger=createLogger();
        logger.writeLog();
    }

    public abstract Logger createLogger();
}