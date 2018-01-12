package cn.riversky.gitbook.action.template;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/11.
 */
public class XmlViewwe extends Viewer {
    @Override
    String converData(String data) {
        return data+".xml";
    }
}
