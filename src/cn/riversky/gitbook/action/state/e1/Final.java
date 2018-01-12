package cn.riversky.gitbook.action.state.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/11.
 */
public class Final extends Professional {


    @Override
    void peekCards(Game game) {
        checkState(game);
        System.out.println("偷看牌技能");
    }
}
