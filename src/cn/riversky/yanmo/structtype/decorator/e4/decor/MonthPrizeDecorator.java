package cn.riversky.yanmo.structtype.decorator.e4.decor;

import cn.riversky.yanmo.structtype.decorator.e4.Component;
import cn.riversky.yanmo.structtype.decorator.e4.SaleMoneyDao;

import java.util.Date;

/**
 * 月的计算方式
 * Prize完成该工资的计算，月奖（当月*3%）+累计奖(累计*0.1%)+组奖（如果是管理者全组当月1%）
 * Created by admin on 2017/12/8.
 */
public class MonthPrizeDecorator extends Decorator {
    public MonthPrizeDecorator(Component component) {
        super(component);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        double money=super.calcPrize(user,begin,end);
        double prize= SaleMoneyDao.mapMonthSaleMoney.get(user)*0.03;
        System.out.println("月奖励"+prize);
        return money+prize;
    }
}
