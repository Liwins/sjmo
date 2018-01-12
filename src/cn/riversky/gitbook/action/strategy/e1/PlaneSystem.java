package cn.riversky.gitbook.action.strategy.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/11.
 */
public class PlaneSystem {
    private Plane plane;

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
    public void moni(){
        plane.startfly();
        plane.flying();
    }
}
