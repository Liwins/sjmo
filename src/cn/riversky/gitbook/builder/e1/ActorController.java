package cn.riversky.gitbook.builder.e1;

/**
 * 指挥者
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public class ActorController {
    public Actor construct(ActorBuilder ab){
        ab.buildType();
        ab.buildFace();ab.buildSex();ab.buildCostume();ab.buildHairstyle();
        Actor actor=ab.createActor();
        return actor;
    }
}
