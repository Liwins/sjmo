package cn.riversky.yanmo.actiontype.strategy.e7;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public class FileLog extends LogStrategyTemplate {
    @Override
    protected void doLog(String msg) {
        System.out.println("现在把 '"+msg+"' 记录到文件中");
    }
}
