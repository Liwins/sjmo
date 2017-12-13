package cn.riversky.structtype.decorator.e4;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/12/7.
 */
public class SaleMoneyDao {
    /**
     * 记录每个人的月度销售额，只用了人员，月份没有用
     */
    public static Map<String,Double> mapMonthSaleMoney = new HashMap<String,Double>();
    static  {
        //填充测试数据
        mapMonthSaleMoney.put("张三",10000.0);
        mapMonthSaleMoney.put("李四",20000.0);
        mapMonthSaleMoney.put("王五",30000.0);
    }
    public Map<String,Double> getMapMonthSaleMoney(){
        return mapMonthSaleMoney;
    }

}
