package cn.riversky.abstractfactory.example4.factory;

import cn.riversky.abstractfactory.example4.product.GAMainboard;
import cn.riversky.abstractfactory.example4.product.HyMemory;
import cn.riversky.abstractfactory.example4.product.IntelCPU;


/**
* 装机方案三：Intel 的CPU + 技嘉的主板 + 现代的内存
*/
public class Type3 implements AbstractFactory {
public Object createProduct(int type) {
Object retObj = null;
//type为1表示创建CPU，type为2表示创建主板，type为3表示创建内存
if(type==1){
retObj = new IntelCPU(1156);
}else if(type==2){
retObj = new GAMainboard(1156);
}
//创建新添加的产品
else if(type==3){
retObj = new HyMemory();
}
return retObj;
}
}
