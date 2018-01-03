package cn.riversky.yanmo.actiontype.visitor.e3.visitor;

import cn.riversky.yanmo.actiontype.visitor.e3.elem.Element1Impl;
import cn.riversky.yanmo.actiontype.visitor.e3.elem.Element2Impl;

/**
 * 访问者的visit是用来被element,accept()调用的
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public class Visitor1Impl extends Visitor{
    @Override
    public void visit1(Element1Impl element1) {
        System.out.println(" visitor1 访问 element1");
        element1.operate1();
    }

    @Override
    public void visit2(Element2Impl element2) {
        System.out.println(" visitor1 访问 element2");
       element2.operate1();
    }
}
