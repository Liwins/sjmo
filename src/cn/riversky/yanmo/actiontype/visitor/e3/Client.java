package cn.riversky.yanmo.actiontype.visitor.e3;

import cn.riversky.yanmo.actiontype.visitor.e3.elem.Element;
import cn.riversky.yanmo.actiontype.visitor.e3.elem.Element1Impl;
import cn.riversky.yanmo.actiontype.visitor.e3.elem.Element2Impl;
import cn.riversky.yanmo.actiontype.visitor.e3.visitor.Visitor1Impl;

/**
 * 访问者设计模式基本结构
 * Element:抽象类，定义接收访问方法
 * ElementImpl：1.实现接收访问方法(方法中传入visitor，调用访问者的方法),2定义自己的操作方法
 * Vistor:访问者接口1定义访问（自己需要的）访问方法（传入元素实现类）
 * vistorImpl:访问者的实现类1实现对被访问元素的操作
 * ObjectStructure:对象组合：对外提供访问元素的遍历
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public class Client {
    public static void main(String[] args) {
        ObjectStruct os=new ObjectStruct();
        Element ele1=new Element1Impl();
        Element ele2=new Element2Impl();
        os.addElement(ele1);
        os.addElement(ele2);
//        访问者1对元素进行访问
        os.handleRequest(new Visitor1Impl());
    }
}
