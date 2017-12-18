package cn.riversky.actiontype.visitor.e3.elem;

import cn.riversky.actiontype.visitor.e3.visitor.Visitor;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public class Element2Impl extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit2(this);
    }
    public void operate1(){
        System.out.println("ele 2 operate方法");
    }
}
