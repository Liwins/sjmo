package cn.riversky.structtype.composite.e7;

/**
 * 通过路径建立父子关系
 * Created by admin on 2017/12/6.
 */
public class Client {
    public static void main(String[] args) {
        //定义所有的组合对象
        BaseNode root = new Node("军长");
        BaseNode c1 = new Node("师长1");
        BaseNode c9 = new Node("师长2");
        BaseNode c2 = new Node("旅长");
        BaseNode c3 = new Node("团长");
        BaseNode c4 = new Node("营长");
        BaseNode c5 = new Node("连长");
        BaseNode c6 = new Node("排长");
        //设置一个环状引用
        root.addChild(c1);
        root.addChild(c9);
        c1.addChild(c2);
        c9.addChild(c2);
		c2.addChild(c3);
        c3.addChild(c4);
        c4.addChild(c5);
        c5.addChild(c6);

        System.out.println(c6.getCompontPath());

        //调用根对象的输出功能来输出整棵树
        root.printStruct("");
    }
}
