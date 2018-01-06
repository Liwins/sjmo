package cn.riversky.gitbook.Structtype.facade;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/5.
 */
public class XmlUtils {
    public static Object getBean(int index) throws ParserConfigurationException, IOException, SAXException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        DocumentBuilder builder= DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc=builder.parse(new File("resources/facade.xml"));
        NodeList list=doc.getElementsByTagName("list");
        Node node=list.item(index).getLastChild();
        String objName=node.getNodeValue();
        Class clazz=Class.forName(objName);
        return clazz.newInstance();
    }

    public static void main(String[] args) throws SAXException, IllegalAccessException, IOException, InstantiationException, ParserConfigurationException, ClassNotFoundException {
        System.out.println(getBean(0).getClass().getName());
    }
}
