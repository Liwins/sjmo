package cn.riversky.gitbook.Structtype.bridge.example;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public class XMLUtils {
    public static Object getBean(int index) {
        try {
            DocumentBuilder builder= DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc=builder.parse(new File("resources/config.xml"));
            NodeList list=doc.getElementsByTagName("className");
            Node node=list.item(index);
            String value=node.getFirstChild().getNodeValue();
            Class clazz=Class.forName(value);
            return clazz.newInstance();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
