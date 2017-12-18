package cn.riversky.actiontype.visitor.e3;

import cn.riversky.actiontype.visitor.e3.elem.Element;
import cn.riversky.actiontype.visitor.e3.visitor.Visitor;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 其实就是把容器构造起来，对外提供统一的遍历调用
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public class ObjectStruct {
    private Collection<Element> col=new ArrayList<Element>();

    /**
     * 提供给客户端的高层接口,对col中的元素设置访问者
     * @param visitor 客户端需要使用的访问者
     */
    public void handleRequest(Visitor visitor){
        for(Element e:col){
            e.accept(visitor);
        }
    }
    /**
     * 示意方法，组建对象结构，向对象结构中添加元素。
     * 不同的对象结构有不同的构建方式
     * @param ele 加入到对象结构的元素
     */
    public void addElement(Element ele){
        this.col.add(ele);
    }
}
