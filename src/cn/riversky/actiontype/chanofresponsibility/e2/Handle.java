package cn.riversky.actiontype.chanofresponsibility.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/14.
 */
public abstract class Handle {
    protected  Handle handle;
    public void setHandle(Handle handle){
        this.handle=handle;
    }

    /**
     * 处理业务
     */
    public abstract void handle();

}
