package cn.riversky.actiontype.state.e4;

import java.util.HashMap;
import java.util.Map;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class VoteManager {
    /**
     * 记录当前每个用户对应的状态处理对象，每个用户当前的状态是不同的
     * Map<String,VoteState>对应Map<用户名称,当前对应的状态处理对象>
     */
    private Map<String,VoteState> mapState = new HashMap<String,VoteState>();
    private Map<String ,String> voteMap=new HashMap<>(8);
    private Map<String,Integer> voteMapCount=new HashMap<>(8);

    public Map<String, VoteState> getMapState() {
        return mapState;
    }

    public Map<String, String> getVoteMap() {
        return voteMap;
    }

    public Map<String, Integer> getVoteMapCount() {
        return voteMapCount;
    }
    public void  vote(String user,String voteItem){
        Integer oldCount=voteMapCount.get(user);
        if(oldCount==null){
            oldCount=0;
        }
        oldCount++;
        voteMapCount.put(user,oldCount);
        //获取投票状态
        VoteState state=mapState.get(user);
        if(state==null){
            state=new NormalVoteState();
        }
        state.vote(user,voteItem,this);

    }
}
