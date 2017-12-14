package cn.riversky.structtype.decorator.e6.model;

/**
 *@author  Created by admin on 2017/12/13.
 */
public class SailMode {
    /**
     * 销售的商品
     */
    private String goods;
    /**
     * 销售的数量
     */
    private int saleNum;
    public String getGoods() {
        return goods;
    }
    public void setGoods(String goods) {
        this.goods = goods;
    }
    public int getSaleNum() {
        return saleNum;
    }
    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }

    public String toString(){
        return "商品名称="+goods+",购买数量="+saleNum;
    }
}
