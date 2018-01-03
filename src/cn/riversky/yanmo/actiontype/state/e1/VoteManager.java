package cn.riversky.yanmo.actiontype.state.e1;

import java.util.HashMap;
import java.util.Map;

/**
 * 投票管理类
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class VoteManager {
    /**
     * 记录用户投票结果,<用户名称，投票选项>
     */
    private Map<String,String> mapVote=new HashMap<>(8);
    /**
     * 记录用户投票次数，<用户名称，投票次数>
     */
    private Map<String,Integer> mapVoteCount=new HashMap<>(8);

    /**
     * 投票
     * @param user 投票人
     * @param voteItem 投票选项
     */
    public void vote(String user,String voteItem){
        Integer oldVoteCount=mapVoteCount.get(user);
        if(oldVoteCount==null){
            oldVoteCount=0;
        }
        oldVoteCount++;
        mapVoteCount.put(user,oldVoteCount);
        if(oldVoteCount==1){
            System.out.println("投票成功");
            mapVote.put(user,voteItem);
        }else if(oldVoteCount>1&&oldVoteCount<5){
            System.out.println("重复投票");
        }else if(oldVoteCount>=5&&oldVoteCount<8){
            String s= mapVote.get(user);
            if(s!=null){
                mapVote.remove(user);
            }
            System.out.println("你恶意刷票，取消投票资格");
        }else if(oldVoteCount>=8){
            System.out.println("又是你，进入黑名单吧");
        }
    }
}
