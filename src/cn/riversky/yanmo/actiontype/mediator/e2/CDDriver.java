package cn.riversky.yanmo.actiontype.mediator.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/2.
 */
public class CDDriver extends BaseColleague {
    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    /**
     * 光驱读出来的数据
     */
    private String data="";

    public String getData() {
        return data;
    }
    /**
     * 读取光盘
     */
    public void readCD(String cd){
        if(cd==null||cd.trim().length()==0){
            data="设计模式,值得好好研究";
        }else {
            data=cd;
        }
        getMediator().changed(this);
    }
}
