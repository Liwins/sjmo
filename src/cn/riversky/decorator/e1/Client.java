package cn.riversky.decorator.e1;

import cn.riversky.decorator.e1.db.Prize;

/**
 * 不使用模式实现员工的工资计算方式，SaleMoneyDao模拟出数据库的当月销售额
 * Prize完成该工资的计算，月奖（当月*3%）+累计奖(累计*0.1%)+组奖（如果是管理者全组当月1%）
 * Created by admin on 2017/12/6.
 */
public class Client {
    public static void main(String[] args) {

        //先创建计算奖金的对象
        Prize p = new Prize();

        //日期对象都没有用上，所以传null就可以了
        double zs = p.calcPrize("张三",null,null);
        System.out.println("==========张三应得奖金："+zs);
        double ls = p.calcPrize("李四",null,null);
        System.out.println("==========李四应得奖金："+ls);
        double ww = p.calcPrize("王五",null,null);
        System.out.println("==========王经理应得奖金："+ww);
    }
}
