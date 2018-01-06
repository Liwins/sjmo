package cn.riversky.gitbook.creatType.sigleton.e1;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
/**
 *
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public class XMLUtil {
    /**
     * 该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
     * @return
     */
    public static Object getBean(){
        try {
            DocumentBuilder builder= DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc;
            doc=builder.parse(new File("resources/config.xml"));
            NodeList n1=doc.getElementsByTagName("className");
            Node classNode=n1.item(0).getFirstChild();
            String cName=classNode.getNodeValue();
            //通过类名生成实例对象并将其返回
            Class c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
