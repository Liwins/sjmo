package cn.riversky.yanmo.actiontype.visitor.e5;

import cn.riversky.yanmo.actiontype.visitor.e5.elem.Component;
import cn.riversky.yanmo.actiontype.visitor.e5.elem.Composite;
import cn.riversky.yanmo.actiontype.visitor.e5.elem.Leaf;
import cn.riversky.yanmo.actiontype.visitor.e5.visitor.PrintNameVisitor;

/**
 * 访问者模式和组件模式的结合
 * Element->Component,定义accept
 * Element extend->Composite,leaf，分别代表组件模式中composite和leaf
 * Visitor
 * visitorimpl->printNameVistor
 * objectStructure
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public class Client {
    public static void main(String[] args) {
        //定义所有的组合对象
        Component root = new Composite("服装");
        Component c1 = new Composite("男装");
        Component c2 = new Composite("女装");
        //定义所有的叶子对象
        Component leaf1 = new Leaf("衬衣");
        Component leaf2 = new Leaf("夹克");
        Component leaf3 = new Leaf("裙子");
        Component leaf4 = new Leaf("套装");
        //按照树的结构来组合组合对象和叶子对象
        root.addChild(c1);
        root.addChild(c2);

        c1.addChild(leaf1);
        c1.addChild(leaf2);

        c2.addChild(leaf3);
        c2.addChild(leaf4);
        ObjectStructure os=new ObjectStructure();
        os.setRoot(root);
//        os.handRequest(new PrintNameVisitor());
        //如果有必要可以省去ObjectStructuer,因为组合模式的访问特点：在组件内实现了访问
        root.accept(new PrintNameVisitor());
    }
}
