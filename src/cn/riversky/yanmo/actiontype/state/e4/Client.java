package cn.riversky.yanmo.actiontype.state.e4;

/**
 * 这里实现了工作流模拟，一级一级进行处理
 * state->voteState:状态接口
 * stateImpl->normal,repeat,spite,blackwarn,blackvote：实现接口中包含context的传入，一级一级进行处理判定，spite中取消投票。
 * context->VoteManage,作为数据的集体容器，包含，投票，投票计数，状态容器（保存当前状态的级别）
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/21.
 */
public class Client {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for(int i=0;i<10;i++){
            vm.vote("u1", "A");
        }
    }
}
