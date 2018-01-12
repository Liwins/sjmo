package cn.riversky.gitbook.action.state.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/11.
 */
public class Secondary extends State {

    @Override
    void doubleScore(Game game) {
        checkState(game);
        System.out.println("双倍积分");
    }
}
