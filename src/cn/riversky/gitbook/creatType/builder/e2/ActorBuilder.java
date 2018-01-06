package cn.riversky.gitbook.creatType.builder.e2;


/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public abstract class ActorBuilder {
    protected static Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    /**
     * 工厂方法，返回一个完整的游戏角色对象
     */
    public Actor createActor() {
        this.buildType();
        this.buildSex();
        this.buildFace();
        this.buildCostume();
        this.buildHairstyle();
        return actor;
    }
    /**
     * 工厂方法，返回一个完整的游戏角色对象
     */
    public static Actor createActor2(ActorBuilder ab) {
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        return actor;
    }

}
