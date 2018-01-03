package cn.riversky.yanmo.createtype.abstractfactory.example4.factory;

import cn.riversky.yanmo.createtype.abstractfactory.example4.product.GAMainboard;
import cn.riversky.yanmo.createtype.abstractfactory.example4.product.IntelCPU;

/**
 * Created by admin on 2017/11/27.
 */
public class Type1 implements AbstractFactory {
    public Object createProduct(int type) {
        Object retObj = null;
        //type为1表示创建CPU，type为2表示创建主板
        if(type==1){
            retObj = new IntelCPU(1156);
        }else if(type==2){
            retObj = new GAMainboard(1156);
        }
        return retObj;
    }
}
