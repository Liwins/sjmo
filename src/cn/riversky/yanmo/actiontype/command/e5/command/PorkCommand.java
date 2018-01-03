package cn.riversky.yanmo.actiontype.command.e5.command;

import cn.riversky.yanmo.actiontype.command.e5.receive.CookApi;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class PorkCommand implements Command{
    private CookApi cookApi = null;

    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }


    public void execute() {
        this.cookApi.cook("蒜泥白肉");
    }
}
