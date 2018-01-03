package cn.riversky.yanmo.actiontype.state.e4;


/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class NormalVoteState implements VoteState{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //完成投票
        System.out.println("恭喜完成投票");
        voteManager.getVoteMap().put(user,voteItem);
        voteManager.getMapState().put(user,new RepeatVoteState());
    }
}
