package cn.riversky.yanmo.actiontype.mediator.e1;

/**
 * 中介者的实现
 * 以属性方式拥有所有的同事类实现
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/2.
 */
public class MediatorImpl implements Mediator{
    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;
    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }
    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    /**
     * 某个同事类发生了变化，通常需要与其他同事交互
     * 具体协调相应的同事对象来实现协作行为
     * @param baseColleague 同事对象自身，好让中介者对象通过对象实例去获取同事对象的状态
     */
    @Override
    public void changed(BaseColleague baseColleague) {

    }
}
