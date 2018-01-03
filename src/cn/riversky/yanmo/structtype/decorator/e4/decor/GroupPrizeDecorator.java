package cn.riversky.yanmo.structtype.decorator.e4.decor;

import cn.riversky.yanmo.structtype.decorator.e4.Component;
import cn.riversky.yanmo.structtype.decorator.e4.SaleMoneyDao;

import java.util.Date;

/**
 * 累计将
 * Prize完成该工资的计算，月奖（当月*3%）+累计奖(累计*0.1%)+组奖（如果是管理者全组当月1%）
 * Created by admin on 2017/12/8.
 */
public class GroupPrizeDecorator extends Decorator {
    public GroupPrizeDecorator(Component component) {
        super(component);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        double old = super.calcPrize(user, begin, end);
        double prize = 0;
        double sum = 0;
        for (double s : SaleMoneyDao.mapMonthSaleMoney.values()) {
            sum += s;
        }
        System.out.println("组奖励"+sum);
        prize = sum * 0.01;
        return old + prize;
    }
}
