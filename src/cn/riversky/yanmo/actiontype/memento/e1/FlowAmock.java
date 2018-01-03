package cn.riversky.yanmo.actiontype.memento.e1;

/**
 * 模拟运行流程A，只是一个示意，代指某个具体流程
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/29.
 */
public class FlowAmock {
    /**
     * 流程名称，不需要外部存储的状态数据
     */
    private String flowName;
    /**
     * 示意，代指某个中间结果，需要外部存储的状态数据
     */
    private int tempResult;
    /**
     * 代指某个中间结果，需要外部存储的状态数据
     */
    private String tempState;
    public FlowAmock(String flowName) {
        this.flowName = flowName;
    }

    public String getFlowName() {
        return flowName;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    public int getTempResult() {
        return tempResult;
    }

    public void setTempResult(int tempResult) {
        this.tempResult = tempResult;
    }

    public String getTempState() {
        return tempState;
    }

    public void setTempState(String tempState) {
        this.tempState = tempState;
    }

    /**
     * 第一阶段
     */
    public void runPhaseOne(){
        tempResult=3;
        tempState="PhaseOne";
    }

    /**
     * 方案一的流程后半部分
     */
    public void schemal(){
        this.tempState+=",Schemal";
        System.out.println(tempState+": now run "+tempResult);
    }
    public void schema2(){
        this.tempState+=",Schemal2";
        System.out.println(tempState+" : now run "+tempResult);
        tempResult+=22;
    }

}
