package cn.riversky.actiontype.state.e4;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public interface VoteState {
    public void vote(String user,String voteItem,VoteManager voteManager);
}
