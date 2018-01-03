package cn.riversky.yanmo.actiontype.state.e4;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("重複投票");
        if(voteManager.getVoteMapCount().get(user)>4){
            voteManager.getMapState().put(user,new SpiteVoteState());
        }
    }
}
