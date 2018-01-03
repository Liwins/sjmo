package cn.riversky.yanmo.actiontype.mediator.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/2.
 */
public abstract class BaseColleague {
    /**
     * 持有中介者，每个同事类都知道，中介（用来报告）
     */
    private Mediator mediator;

    public BaseColleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
