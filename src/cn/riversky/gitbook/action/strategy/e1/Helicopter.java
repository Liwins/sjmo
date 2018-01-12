package cn.riversky.gitbook.action.strategy.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/11.
 */
public class Helicopter implements Plane {
    @Override
    public void startfly() {
        System.out.println(this.getClass().getSimpleName()+"垂直起飞"+StartType.VerticalTakeOff);
    }

    @Override
   public  void flying() {
        System.out.println(this.getClass().getSimpleName()+"飞行特点:"+FlyType.SubSonicFly);
    }
}
