package cn.riversky.gitbook.Structtype.bridge.example;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public class TxtType extends FileType {
    @Override
    String changeTo() {
        return "txtType:"+dataBase.readData();
    }
}
