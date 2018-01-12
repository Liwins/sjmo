package cn.riversky.gitbook.action.state.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/11.
 */
public class Primary extends State {



    @Override
    void play(Game game) {
        super.play(game);
        checkState(game);
    }
}
