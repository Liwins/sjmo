package cn.riversky.yanmo.actiontype.strategy.e7;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/20.
 */
public class DbLog extends LogStrategyTemplate {
    @Override
    protected void doLog(String msg) {
        //制造错误
        if(msg!=null && msg.trim().length()>5){
            int a = 5/0;
        }
        System.out.println("现在把 '"+msg+"' 记录到数据库中");
    }
}
