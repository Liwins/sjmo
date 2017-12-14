package cn.riversky.structtype.composite.e1;

/**
 * Created by admin on 2017/12/6.
 */
public class Client {
    public static void main(String[] args) {
        //定义组合对象
        Composite root=new Composite("学校");
        Composite c1=new Composite("计算机学院");
        Composite c2=new Composite("电信学院");
        Composite c3=new Composite("建工学院");
        //定义所有的叶子对象
        Leaf leaf11=new Leaf("计算机科学技术");
        Leaf leaf12=new Leaf("软件工程");
        Leaf leaf13=new Leaf("网络工程");
        Leaf leaf21=new Leaf("电子信号处理");
        Leaf leaf22=new Leaf("嵌入式");
        Leaf leaf23=new Leaf("自动化");
        Leaf leaf31=new Leaf("暖通");
        Leaf leaf32=new Leaf("土木");
        root.addComposite(c1).addComposite(c2).addComposite(c3);
        c1.addLeaf(leaf11).addLeaf(leaf12).addLeaf(leaf13);
        c2.addLeaf(leaf21).addLeaf(leaf22).addLeaf(leaf23);
        c3.addLeaf(leaf31).addLeaf(leaf32);
        root.printStruct("  ");

    }
}
