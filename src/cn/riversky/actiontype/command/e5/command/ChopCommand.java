package cn.riversky.actiontype.command.e5.command;

import cn.riversky.actiontype.command.e5.receive.CookApi;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class ChopCommand implements Command {
    private CookApi cookApi=null;

    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }

    @Override
    public void execute() {
        cookApi.cook("绿豆排骨煲");
    }
}
