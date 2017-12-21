package cn.riversky.actiontype.state.e3;

/**
 * state->VoteState:定义状态方法
 * stateImpl->normal,repeatespite,blackwarn,black不同状态的行为
 * context->voteManager,上下文，具备判定状态的方法和属性
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class Client {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for(int i=0;i<11;i++){
            vm.vote("u1", "A");
        }
    }

}
