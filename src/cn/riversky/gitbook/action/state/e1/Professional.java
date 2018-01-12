package cn.riversky.gitbook.action.state.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/11.
 */
public class Professional extends Secondary {


    @Override
    void changeCards(Game game) {
        checkState(game);
        System.out.println("换牌技能");
    }
}
