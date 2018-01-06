package cn.riversky.gitbook.Structtype.facade;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**外观模式
 * 描述：
 * 外观模式中，一个子系统的外部与其内部的通信通过一个统一的外观类进行，外观类将客户类与子系统的内部复杂性分隔开，使得客户类
 * 只需要与外观角色打交道，而不需要与子系统内部的很多对象打交道。
 * 定义：
 * 为子系统中的一组接口提供一个统一的入口。外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 * 外观模式又称为门面模式，它是一种对象结构型模式。外观模式是迪米特法则的一种具体实现，通过引入一个新的外观角色可以降低原有
 * 系统的复杂度，同时降低客户类与子系统的耦合度。
 * 应用：
 * 抽象外观类：
 * 在标准的外观模式结构图中，如果需要增加、删除或更换与外观类交互的子系统类，必须修改外观类或客户端的源代码，这将违背开闭
 * 原则，，因此可以通过引入抽象外观类来对系统进行改进，在一定程度上可以解决该问题。在引入抽象外观类后，客户端可以针对抽象
 * 外观类进行变成层，对于新的业务需求，不需要修改原有的外观类，而对应增加一个新的具体外观类，有新的具体外观类来关联新的子
 * 系统对象，同时通过修改配置文件来达到不修改任何源码而达到更改外观类的目的。
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/5.
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException, ParserConfigurationException, InstantiationException, SAXException, IllegalAccessException {
        FacadeAbstract facade= (FacadeAbstract) XmlUtils.getBean(1);
        facade.fileEncrypy("D:\\offi\\office2016激活\\使用说明.txt","D:\\offi\\office2016激活\\2.txt");
    }
}
