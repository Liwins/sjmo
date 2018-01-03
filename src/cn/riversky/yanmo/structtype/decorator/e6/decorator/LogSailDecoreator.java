package cn.riversky.yanmo.structtype.decorator.e6.decorator;

import cn.riversky.yanmo.structtype.decorator.e6.base.Sail;
import cn.riversky.yanmo.structtype.decorator.e6.model.SailMode;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 2017/12/13.
 */
public class LogSailDecoreator extends DecoratorAbstract{


    /**
     * 这个构造函数比较重要，这样才可以使用循环装饰功能
     * @param sail
     */
    public LogSailDecoreator(Sail sail) {
        super(sail);
    }

    @Override
    public boolean sale(String user, String customer, SailMode saleModel) {
        System.out.println("日志类的修饰----------------");
        //在执行业务功能过后，记录日志
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println("日志记录："+user+"于"+df.format(new Date())+"时保存了一条销售记录，客户是"+customer+",购买记录是"+saleModel);

        System.out.println("日志类的修饰----------------");
       return sail.sale(user,customer,saleModel);
    }
}
