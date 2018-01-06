package cn.riversky.gitbook.Structtype.composite.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/4.
 */
public class ButtonLeaf extends Kongjian {
    String name;

    public ButtonLeaf(String name) {
        this.name = name;
    }

    @Override
    void visit() {
        System.out.println("ButtonLeaf:"+name);
    }
}
