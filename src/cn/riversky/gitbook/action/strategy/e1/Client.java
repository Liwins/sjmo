package cn.riversky.gitbook.action.strategy.e1;

/**
 * Sunny软件公司欲开发一款飞机模拟系统，该系统主要模拟不同种类飞机的飞行特征与起飞特征，需要模拟的飞机种类及其特征如下
 * 飞机种类             起飞特征                            飞行特征
 * 直升机(Helicopter)   垂直起飞(VerticalTakeOff)          亚音速飞行（SubSonicFly）
 * 客机（AirPlane）     长距离起飞(LongDistanceTakeOff)     亚音速飞行（subSonicFly）
 * 歼击机(Fighter)      长距离起飞（LongDistanceTakeOff）    超音速飞行(SuperSonicFly)
 * 鹞式战斗机(Harrier)   垂直起飞（VerticalTakeOff）          超音速飞行（SuperSonicFly）
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/11.
 */
public class Client {
    public static void main(String[] args) {
        Plane plane=new Helicopter();

        PlaneSystem system=new PlaneSystem();
        system.setPlane(plane);
        system.moni();

        plane=new AirPlane();
        system.setPlane(plane);
        system.moni();
        plane=new Fighter();
        system.setPlane(plane);
        system.moni();
        plane=new Harrier();
        system.setPlane(plane);
        system.moni();
    }
}
