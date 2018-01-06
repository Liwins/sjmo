package cn.riversky.gitbook.Structtype.flyweight.e1;

/**
 * 享元模式：个人理解，感觉类似于缓存的实现，但是在缓存的基本类中，会使用到其他动态变化的类。而达到静则共享，动则设置的状态。
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/5.
 */
public class Client {
    public static void main(String[] args) {
        IgoChessman b1,b2,b3,w1,w2;
        IgoChessmanFacotry facotry=IgoChessmanFacotry.getInstance();
        b1=facotry.getIgoChessman("b");
        b2=facotry.getIgoChessman("b");
        b3=facotry.getIgoChessman("b");
        w1=facotry.getIgoChessman("w");
        w2=facotry.getIgoChessman("w");
        System.out.println("黑色相同:"+(b1==b2));
        System.out.println("白色相同:"+(w1==w2));
        b1.display(new Coordinates(1,2));
        b2.display(new Coordinates(3,4));
        b3.display(new Coordinates(6,3));
        w1.display(new Coordinates(6,4));
        w2.display(new Coordinates(7,4));
    }
}
