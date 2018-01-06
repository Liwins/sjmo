package cn.riversky.gitbook.creatType.builder.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public class Client {
    public static void main(String[] args) {
        ActorBuilder o= (ActorBuilder) XMLUtil.getBean();
        ActorController controller=new ActorController();
        Actor actor=controller.construct(o);
        System.out.println(actor.getType());
        System.out.println(actor.getSex());
        System.out.println(actor.getFace());
        System.out.println(actor.getConstume());
    }
}
