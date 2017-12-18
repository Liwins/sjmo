package cn.riversky.actiontype.visitor.e5.visitor;

import cn.riversky.actiontype.visitor.e5.elem.Composite;
import cn.riversky.actiontype.visitor.e5.elem.Leaf;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public class PrintNameVisitor implements Visitor{

    @Override
    public void componentVisit(Composite component) {
        System.out.println("    "+component.getName());
    }

    @Override
    public void leafVisit(Leaf leaf) {
        System.out.println("    "+leaf.getName());
    }
}
