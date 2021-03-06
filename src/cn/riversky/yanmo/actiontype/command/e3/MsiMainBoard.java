package cn.riversky.yanmo.actiontype.command.e3;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/15.
 */
public class MsiMainBoard implements MainBoard {
    @Override
    public void openComputer() {
        System.out.println("微星主板现在正在开机，请等候");
        System.out.println("接通电源......");
        System.out.println("设备检查......");
        System.out.println("装载系统......");
        System.out.println("机器正常运转起来......");
        System.out.println("机器已经正常打开，请操作");
    }

    @Override
    public void resetComputer() {
        System.out.println("微星主板现在正在重新启动机器，请等候");
        System.out.println("机器已经正常打开，请操作");
    }
}
