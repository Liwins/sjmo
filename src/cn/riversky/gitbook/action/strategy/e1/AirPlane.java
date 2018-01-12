package cn.riversky.gitbook.action.strategy.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/11.
 */
public class AirPlane implements Plane {
    @Override
    public void startfly() {
        System.out.println(this.getClass().getSimpleName()+"长距离起飞"+StartType.LongDistanceTakeOff);
    }

    @Override
    public void flying() {
        System.out.println(this.getClass().getSimpleName()+"亚音速飞行"+FlyType.SubSonicFly);
    }
}
