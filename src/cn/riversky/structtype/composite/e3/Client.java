package cn.riversky.composite.e3;

/**
 * Created by admin on 2017/12/6.
 */
public class Client {
    public static void main(String[] args) {
        //定义多个Composite对象
        Component root = new Composite("学校");
        Component c1 = new Composite("计算机学院");
        Component c2 = new Composite("电子信息学院");
        //定义多个叶子对象
        Component leaf1 = new Leaf("计算机科学");
        Component leaf2 = new Leaf("计算机网络");
        Component leaf3 = new Leaf("PLC");
        Component leaf4 = new Leaf("信号处理");

        //组和成为树形的对象结构
        root.addChild(c1);
        root.addChild(c2);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf4);
        c2.addChild(leaf3);

        //操作Component对象
        Component o = root.getChildren(1);
        o.getChildren(1).printStr("  ");
        root.printStr("  ");
    }
}
