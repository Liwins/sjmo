package cn.riversky.gitbook.action.responchain;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/6.
 */
public class JingLi extends ShenPi {
    private String name;

    public JingLi(String name) {
        this.name = name;
    }

    @Override
    void dealShen(QingJiaModel model) {
        if(model.getDay()<10){
            System.out.println("经理："+name+"通过审批"+model.getName()+","+model.getDescript());
        }else {
            shenPi.dealShen(model);
        }
    }
}
