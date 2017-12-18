package cn.riversky.actiontype.visitor.e5;

import cn.riversky.actiontype.visitor.e5.elem.Component;
import cn.riversky.actiontype.visitor.e5.visitor.Visitor;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public class ObjectStructure {
    private Component root=null;
    public void handRequest(Visitor visitor){
       if(root!=null){
           root.accept(visitor);
       }
    }
    public void setRoot(Component component){
        root=component;
    }
}
