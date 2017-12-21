package cn.riversky.actiontype.state.e3;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class SpiteVoteState implements VoteState{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        String s=voteManager.getMapVote().get(user);
        if(s!=null){
            voteManager.getMapVote().remove(user);
        }
        System.out.println("恶意刷票，取消资格："+user);
    }
}
