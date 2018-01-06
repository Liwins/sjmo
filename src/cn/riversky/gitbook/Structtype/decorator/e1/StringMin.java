package cn.riversky.gitbook.Structtype.decorator.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public class StringMin implements Encycle{
    @Override
    public String encode(String data) {
        return data;
    }
}
