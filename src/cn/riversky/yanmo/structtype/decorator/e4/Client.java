package cn.riversky.yanmo.structtype.decorator.e4;

import cn.riversky.yanmo.structtype.decorator.e4.decor.Decorator;
import cn.riversky.yanmo.structtype.decorator.e4.decor.MonthPrizeDecorator;
import cn.riversky.yanmo.structtype.decorator.e4.decor.SumPrizeDecorator;

/**
 * 这里使用装饰和实现的模式，component提供基本接口，
 * 基本功能类（需要被装饰的对象） concreteCoponent
 * 装饰基本抽象类，decorator
 * 真实装饰类group,month sum,
 * Created by admin on 2017/12/6.
 * 使用时通过组合就可以得出奖金的计算方式
 */
public class Client {
    public static void main(String[] args) {
//先创建计算基本奖金的类，这也是被装饰的对象
        Component c1 = new ConcreteComponent();

        //然后对计算的基本奖金进行装饰，这里要组合各个装饰
        //说明，各个装饰者之间最好是不要有先后顺序的限制，也就是先装饰谁和后装饰谁都应该是一样的

        //先组合普通业务人员的奖金计算
        Decorator d1 = new MonthPrizeDecorator(c1);
        Decorator base = new SumPrizeDecorator(d1);

        //注意：这里只需要使用最后组合好的对象调用业务方法即可，会依次调用回去
        //日期对象都没有用上，所以传null就可以了

        Decorator manager = new MonthPrizeDecorator(base);
        double zs = base.calcPrize("张三",null,null);
        System.out.println("==========张三应得奖金："+zs);
        double ls = base.calcPrize("李四",null,null);
        System.out.println("==========李四应得奖金："+ls);

        //如果是业务经理，还需要一个计算团队的奖金计算
        double ww = manager.calcPrize("王五",null,null);
        System.out.println("==========王经理应得奖金："+ww);
    }
}
