package cn.riversky.yanmo.actiontype.strategy.e7;

/**
 * 日志记录方式：策略模式+模版模式
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public class Client {
    public static void main(String[] args) {
        LogContext log = new LogContext();
        log.log("记录日志");
        log.log("再次记录日志");
    }
}
