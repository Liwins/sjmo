package cn.riversky.abstractfactory.example1.factory;

import cn.riversky.abstractfactory.example1.product.GAMainboard;
import cn.riversky.abstractfactory.example1.product.MSIMainboard;
import cn.riversky.abstractfactory.example1.product.MainboardApi;

/**
 * Created by admin on 2017/11/27.
 */
public class MainboardFactory {
    /**
     * 创建主板接口对象的方法
     * @param type 选择主板类型的参数
     * @return 主板接口对象的方法
     */
    public static MainboardApi createMainboardApi(String type){
        MainboardApi mainboard = null;
        //根据参数来选择并创建相应的主板对象
        if("GA".equals(type)){
            mainboard = new GAMainboard(1156);
        }else{
            mainboard = new MSIMainboard(939);
        }
        return mainboard;
    }
}
