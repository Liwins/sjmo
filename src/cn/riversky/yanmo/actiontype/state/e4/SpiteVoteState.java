package cn.riversky.yanmo.actiontype.state.e4;

/**
 * 惡意刷票，清除用戶投票數據
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        String s=voteManager.getVoteMap().get(user);
        if(s!=null){
            voteManager.getVoteMap().remove(user);
        }
        System.out.println("惡意刷票行爲，取消投票："+user);
        if(voteManager.getVoteMapCount().get(user)>7){
            voteManager.getMapState().put(user,new BlackWarnVoteState());
        }
    }
}
