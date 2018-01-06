package cn.riversky.gitbook.Structtype.bridge.example;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public class OricleData implements DataBase {
    @Override
    public String readData() {
        return "oricleData";
    }
}
