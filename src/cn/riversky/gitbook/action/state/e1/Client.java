package cn.riversky.gitbook.action.state.e1;

/**
 * Sunny公司开发的纸牌游戏，游戏中角色具有入门级（Primary）,熟练级（Secondary）高手级和骨灰级（Final），角色等级与其
 * 积分相对应，游戏能力将怎家积分，失败扣除积分，入门级具有最基本的游戏功能play，熟练级别具有积分加倍，高手可以换牌，
 * 骨灰级可以偷看他人牌的功能
 * 设计有问题，虽然满足需求，但是最好将操作放在Game中进行，降低State的职责，因为扩展的时候增加的方法太多
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/11.
 */
public class Client {
    public static void main(String[] args) {
        Game game=new Game("张三",120);
        game.setScore(0);
        game.play();
        System.out.println("-----------------------");
        game.setScore(110);
        game.play();
        System.out.println("-----------------------");
        game.setScore(200);
        game.play();
        System.out.println("-----------------------");
        game.setScore(300);
        game.play();
    }
}
