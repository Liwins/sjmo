package cn.riversky.yanmo.structtype.composite.e5;



/**
 * 将非叶子节点的功能放到非叶子节点中，通过抽象类，将root.add()中加的对象抽象到父类中。
 * 通过在非叶子节点类中的容器存放父抽象类实现。
 * Created by admin on 2017/12/6.
 */
public class Client {
    public static void main(String[] args) {
        //定义所有的组合对象
        Composite root = new Composite("服装");
        Composite c1 = new Composite("男装");
        Composite c2 = new Composite("女装");
        //定义所有的叶子对象
        Leaf leaf1 = new Leaf("衬衣");
        Leaf leaf2 = new Leaf("夹克");
        Leaf leaf3 = new Leaf("裙子");
        Leaf leaf4 = new Leaf("套装");
        //按照树的结构来组合组合对象和叶子对象
        root.addChild(c1);
        root.addChild(c2);

        c1.addChild(leaf1);
        c1.addChild(leaf2);

        c2.addChild(leaf3);
        c2.addChild(leaf4);

        //调用根对象的输出功能来输出整棵树
        root.printStruct("");
    }
}
