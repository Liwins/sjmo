package cn.riversky.yanmo.actiontype.memento.e3;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/29.
 */
public class FlowAMock {
    /**
     * 流程名称，不需要外部存储的状态数据
     */
    private String flowName;
    /**
     * 示意，代指某个中间结果，需要外部存储的状态数据
     */
    private int tempResult;
    /**
     * 示意，代指某个中间结果，需要外部存储的状态数据
     */
    private String tempState;
    /**
     * 构造方法，传入流程名称
     * @param flowName 流程名称
     */
    public FlowAMock(String flowName){
        this.flowName = flowName;
    }
    /**
     * 示意，运行流程的第一个阶段
     */
    public void runPhaseOne(){
        //在这个阶段，可能产生了中间结果，示意一下
        tempResult = 3;
        tempState = "PhaseOne";
    }
    /**
     * 示意，按照方案一来运行流程后半部分
     */
    public void schema1(){
        //示意，需要使用第一个阶段产生的数据
        this.tempState += ",Schema1";
        System.out.println(this.tempState + " : now run "+tempResult);
        this.tempResult += 11;
    }
    /**
     * 示意，按照方案二来运行流程后半部分
     */
    public void schema2(){
        //示意，需要使用第一个阶段产生的数据
        this.tempState += ",Schema2";
        System.out.println(this.tempState + " : now run "+tempResult);
        this.tempResult += 22;
    }

    /**
     * 保存原发器对象的状态的备忘录对象
     * @return
     */
    public FlowAMockMemento createMemento(){
        return new MementoImpl(this.tempResult,tempState);
    }
    public void setMemento(FlowAMockMemento memento){
        MementoImpl memento1= (MementoImpl) memento;
        this.tempResult=memento1.getTempResult();
        tempState=memento1.getTempState();
    }
    /**
     * 真正的备忘录对象，实现备忘录窄接口
     * 实现成私有的内部类，不让外部访问
     */
    private static class MementoImpl implements FlowAMockMemento{
        /**
         * 示意，保存某个中间结果
         */
        private int tempResult;
        /**
         * 示意，保存某个中间结果
         */
        private String tempState;
        public MementoImpl(int tempResult,String tempState){
            this.tempResult = tempResult;
            this.tempState = tempState;
        }
        public int getTempResult() {
            return tempResult;
        }
        public String getTempState() {
            return tempState;
        }
    }
}
