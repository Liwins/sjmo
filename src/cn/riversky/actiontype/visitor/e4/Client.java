package cn.riversky.actiontype.visitor.e4;

import cn.riversky.actiontype.visitor.e4.element.Customer;
import cn.riversky.actiontype.visitor.e4.element.EnterpriseCustomer;
import cn.riversky.actiontype.visitor.e4.element.PersonalCustomer;
import cn.riversky.actiontype.visitor.e4.visitor.PredilectionAnalyzeVisitor;
import cn.riversky.actiontype.visitor.e4.visitor.ServiceRequestVisitor;
import cn.riversky.actiontype.visitor.e4.visitor.WorthAnalyzeVisitor;

/**
 * 对e1进行访问者设计模式改进
 * Element->Customer:抽象类，客户元素提供基本的属性和accept（Visitor）接口
 * Element->EnterPriseCustomer,PersonalCustomer，两者分别代表个人用户和企业用户
 * Visitor：访问者接口，定义对对两种类型的用户访问（扩展功能）
 * visitorImpl->serviceRequestvisitor,predictionAnalyzeVisitor,WorthAnalyzeVisitor不同的访问者实现不同的功能扩展
 * ObjectStructure:组合元素和访问者，提供处理功能扩展的调用
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public class Client {
    public static void main(String[] args) {
        //创建ObjectStruct
        ObjectStructure os = new ObjectStructure();
        //准备点测试数据，创建客户对象，并加入ObjectStructure
        Customer cm1 = new EnterpriseCustomer();
        cm1.setName("ABC集团");
        os.addCustomer(cm1);

        Customer cm2 = new EnterpriseCustomer();
        cm2.setName("CDE公司");
        os.addCustomer(cm2);

        Customer cm3 = new PersonalCustomer();
        cm3.setName("张三");
        os.addCustomer(cm3);
        //客户提出服务请求，传入服务请求的Visitor
        os.handle(new ServiceRequestVisitor());
        //要对客户进行偏好分析，传入偏好分析的Visitor
        os.handle(new PredilectionAnalyzeVisitor());
        //要对客户进行价值分析，传入价值分析的Visitor
        os.handle(new WorthAnalyzeVisitor());
    }
}
