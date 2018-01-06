package cn.riversky.gitbook.creatType.builder.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/3.
 */
public abstract class ActorBuilder {
    protected Actor actor=new Actor();
    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();
    /**
     * 工厂方法，返回一个完整的游戏角色对象
     */
    public Actor createActor(){
        return actor;
    }
}
