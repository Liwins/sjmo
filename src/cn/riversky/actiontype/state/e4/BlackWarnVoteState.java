package cn.riversky.actiontype.state.e4;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class BlackWarnVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("禁止登陸和使用系統3天："+user);
        if(voteManager.getVoteMapCount().get(user)>=9){
            voteManager.getMapState().put(user,new BlackVoteState());
        }
    }
}
