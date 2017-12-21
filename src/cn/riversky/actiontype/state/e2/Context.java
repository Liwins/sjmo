package cn.riversky.actiontype.state.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }
    public void request(String sampleParameter){
        state.handle(sampleParameter);
    }
}
