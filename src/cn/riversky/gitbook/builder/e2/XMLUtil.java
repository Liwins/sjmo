package cn.riversky.gitbook.builder.e2;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public class XMLUtil {
    public static Object getBean(){
        try {
            DocumentBuilder builder= DocumentBuilderFactory.newInstance().newDocumentBuilder();
                Document doc=builder.parse("resources/config.xml");
                NodeList nodeList=doc.getElementsByTagName("className");
                Node node=nodeList.item(3).getLastChild();
                String objName=node.getNodeValue();
                Class o=Class.forName(objName);
                return o.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
