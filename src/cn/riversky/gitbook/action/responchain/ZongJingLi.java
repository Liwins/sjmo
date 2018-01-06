package cn.riversky.gitbook.action.responchain;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/6.
 */
public class ZongJingLi extends ShenPi {
    private String name;

    public ZongJingLi(String name) {
        this.name = name;
    }

    @Override
    void dealShen(QingJiaModel model) {
        if(model.getDay()<30){
            System.out.println("总经理："+name+"通过审批"+model.getName()+","+model.getDescript());
        }else {
            System.out.println("总经理"+name+"拒绝"+model.getName()+"的请假");
        }
    }
}
