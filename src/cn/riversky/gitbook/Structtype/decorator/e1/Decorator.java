package cn.riversky.gitbook.Structtype.decorator.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public abstract class Decorator implements Encycle{
    Encycle encycle;

    public Decorator(Encycle encycle) {
        this.encycle = encycle;
    }

    @Override
    public String encode(String data) {
        return null;
    }
}
