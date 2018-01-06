package cn.riversky.gitbook.creatType.builder.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public class AngelBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("漂亮");
    }

    @Override
    public void buildCostume() {
        actor.setConstume("白裙");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("长发");
    }
}
