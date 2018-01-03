package cn.riversky.yanmo.actiontype.visitor.e3.visitor;

import cn.riversky.yanmo.actiontype.visitor.e3.elem.Element1Impl;
import cn.riversky.yanmo.actiontype.visitor.e3.elem.Element2Impl;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public abstract class Visitor {
    /**
     * 定义1的元素的访问
     * @param element1
     */
    public  abstract void visit1(Element1Impl element1);

    /**
     * 定义元素2的访问
     * @param element2
     */
    public abstract  void visit2(Element2Impl element2);
}
