package cn.riversky.gitbook.creatType.builder.e2;


/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("英俊");
    }

    @Override
    public void buildCostume() {
        actor.setConstume("盔甲");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("飘逸");
    }
}
