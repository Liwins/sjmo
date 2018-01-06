package cn.riversky.gitbook.Structtype.bridge.example;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public class XmlType extends FileType {
    @Override
    String changeTo() {
        return "<xml vetsion='1.1' charSet='UTF-8'><data>"+dataBase.readData()+"</data>";
    }
}
