package cn.riversky.yanmo.actiontype.visitor.e3.visitor;

import cn.riversky.yanmo.actiontype.visitor.e3.elem.Element1Impl;
import cn.riversky.yanmo.actiontype.visitor.e3.elem.Element2Impl;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public class Visitor2Impl extends Visitor {
    @Override
    public void visit1(Element1Impl element1) {
        System.out.println("Visit2 对element1进行功能扩展");
        element1.operate1();

    }

    @Override
    public void visit2(Element2Impl element2) {
        System.out.println("Visit2 对element2进行功能扩展");
        element2.operate1();
    }
}
