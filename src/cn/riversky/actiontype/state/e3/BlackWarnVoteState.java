package cn.riversky.actiontype.state.e3;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class BlackWarnVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("禁止登陆和使用系统3天，用户："+user);
    }
}
