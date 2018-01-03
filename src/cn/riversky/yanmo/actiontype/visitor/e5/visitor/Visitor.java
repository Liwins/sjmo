package cn.riversky.yanmo.actiontype.visitor.e5.visitor;

import cn.riversky.yanmo.actiontype.visitor.e5.elem.Composite;
import cn.riversky.yanmo.actiontype.visitor.e5.elem.Leaf;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public interface Visitor {
    void componentVisit(Composite component);
    void leafVisit(Leaf leaf);
}
