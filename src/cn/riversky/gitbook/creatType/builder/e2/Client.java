package cn.riversky.gitbook.creatType.builder.e2;


/**
 * 简化方案，将Director的组装放到抽象类中，但是会违反单一职责原则。
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public class Client {
    public static void main(String[] args) {

        demo1();
        demo2();
    }

    private static void demo2() {
        ActorBuilder actorBuilder= (ActorBuilder) XMLUtil.getBean();
        Actor actor=ActorBuilder.createActor2(actorBuilder);
        System.out.println(actor.getType());
    }

    private static void demo1() {
        ActorBuilder actorBuilder= (ActorBuilder) XMLUtil.getBean();
        Actor actor=actorBuilder.createActor();
        System.out.println(actor.getType());
    }

}
