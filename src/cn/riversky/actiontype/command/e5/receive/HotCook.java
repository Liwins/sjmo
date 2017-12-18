package cn.riversky.actiontype.command.e5.receive;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class HotCook implements CookApi {
    @Override
    public void cook(String name) {
        System.out.println("正在做--热："+name);
    }
}
