package cn.riversky.gitbook.Structtype.composite.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public abstract class Kongjian {
    void add(Kongjian kongjian) {
        throw new UnsupportedOperationException("不支持该操作");
    }

    void remove(Kongjian kongjian) {
        throw new UnsupportedOperationException("不支持该操作");
    }

    Kongjian get(int i) {
        throw new UnsupportedOperationException("不支持该操作");
    }

    abstract void visit();
}
