package cn.riversky.actiontype.visitor.e3.elem;

import cn.riversky.actiontype.visitor.e3.visitor.Visitor;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public abstract class Element {
    /**
     * 接收访问接口
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}
