package cn.riversky.gitbook.action.state.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/11.
 */
public abstract class State {

    void checkState(Game game) {
        if(game.getScore()<100){
            game.setState(game.getPrimary());
        }else if(game.getScore()<200){
            game.setState(game.getSecondary());
        }else if(game.getScore()<300){
            game.setState(game.getProfessional());
        }else {
            game.setState(game.getFinalWanjia());
        }
    }
    void play(Game game){
        System.out.println("玩牌");
        checkState(game);
    }
    void doubleScore(Game game){
        System.out.println(this.getClass().getSimpleName()+"不支持该操作");

    }
    void changeCards(Game game){
        System.out.println(this.getClass().getSimpleName()+"不支持该操作");
    }
    void peekCards(Game game){
        System.out.println(this.getClass().getSimpleName()+"不支持该操作");
    }
}
