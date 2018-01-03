package cn.riversky.yanmo.structtype.decorator.e4.decor;

import cn.riversky.yanmo.structtype.decorator.e4.Component;

import java.util.Date;

/**
 * 累计将
 * Prize完成该工资的计算，月奖（当月*3%）+累计奖(累计*0.1%)+组奖（如果是管理者全组当月1%）
 * Created by admin on 2017/12/8.
 */
public class SumPrizeDecorator extends Decorator {
    public SumPrizeDecorator(Component component) {
        super(component);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        double old=super.calcPrize(user,begin,end);
        double prize=100000*0.001;
        System.out.println("积累奖励"+prize);
        return old+prize;

    }
}
