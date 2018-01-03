package cn.riversky.yanmo.actiontype.state.e2;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public interface State {
    /**
     * 状态对应的处理
     * @param sampleParameter
     */
    public void handle(String sampleParameter);
}
