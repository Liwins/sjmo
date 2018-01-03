package cn.riversky.yanmo.actiontype.state.e3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class VoteManager {
    private VoteState voteState;

    private Map<String ,String> mapVote=new HashMap<>();
    private Map<String,Integer> mapVoteCount=new HashMap<>();

    public Map<String, String> getMapVote() {
        return mapVote;
    }

    public void setVoteState(VoteState voteState) {
        this.voteState = voteState;
    }
    public void vote(String user,String voteItem){
        Integer oldVoteCount= mapVoteCount.get(user);
        if(oldVoteCount==null){
            oldVoteCount=0;
        }
        oldVoteCount++;
        mapVoteCount.put(user,oldVoteCount);
        //2：判断该用户投票的类型，就相当于是判断对应的状态
        //到底是正常投票、重复投票、恶意投票还是上黑名单的状态
        if(oldVoteCount==1){
            setVoteState(new NormalVoteState());
        }else if(oldVoteCount>1 && oldVoteCount<5){
            setVoteState(new RepeatVoteState());
        }else if(oldVoteCount >= 5 && oldVoteCount<8){
            setVoteState(new SpiteVoteState());
        }else if(oldVoteCount>=8 && oldVoteCount<=10){
            setVoteState(new BlackWarnVoteState());
        }else if(oldVoteCount>=10){
            setVoteState(new BlackVoteState());
        }
        //然后转调状态对象来进行相应的操作
        voteState.vote(user, voteItem, this);
    }
}
