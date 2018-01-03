package cn.riversky.yanmo.createtype.abstractfactory.example4.factory;

import cn.riversky.yanmo.createtype.abstractfactory.example4.product.AmdCPU;
import cn.riversky.yanmo.createtype.abstractfactory.example4.product.MSIMainboard;

/**
 * Created by admin on 2017/11/27.
 */
public class Type2 implements AbstractFactory {

    public Object createProduct(int type) {
        Object retObj = null;
        //type为1表示创建CPU，type为2表示创建主板
        if(type==1){
            retObj = new AmdCPU(939);
        }else if(type==2){
            retObj = new MSIMainboard(939);
        }
        return retObj;
    }

}
