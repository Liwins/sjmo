package cn.riversky.yanmo.actiontype.memento.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/29.
 */
public class Client {
    public static void main(String[] args) {
        //创建模拟运行流程的对象
        FlowAmock mock=new FlowAmock("testflow");
        //运行流程的第一阶段
        mock.runPhaseOne();
        //得到第一个阶段运行所产生的数据，后面要用
        int tempResult=mock.getTempResult();
        String tempState=mock.getTempState();
        //按照方案一运行
        mock.schemal();
//        把第一阶段运行所产生的数据重新设置回去
        mock.setTempResult(tempResult);
        mock.setTempState(tempState);
        //按照方案二运行流程的后半部分
        mock.schema2();
    }
}
