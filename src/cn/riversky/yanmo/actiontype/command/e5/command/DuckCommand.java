package cn.riversky.yanmo.actiontype.command.e5.command;

import cn.riversky.yanmo.actiontype.command.e5.receive.CookApi;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class DuckCommand implements Command{
    private CookApi cookApi=null;

    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }

    @Override
    public void execute() {
        cookApi.cook("北京烤鸭");
    }
}
