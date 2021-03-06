package cn.riversky.yanmo.actiontype.memento.e3;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/29.
 */
public class FlowAMockPrototype implements Cloneable {
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
    public FlowAMockPrototype(String flowName){
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
    public FlowAMockMemento createMemento(){
        try {
            return new MementoImplPrototype((FlowAMockPrototype)this.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 真正的备忘录对象，实现备忘录窄接口
     * 实现成私有的内部类，不让外部访问
     */
    private static class MementoImplPrototype implements FlowAMockMemento{
        private FlowAMockPrototype flowAMock = null;

        public MementoImplPrototype(FlowAMockPrototype f){
            this.flowAMock = f;
        }

        public FlowAMockPrototype getFlowAMock() {
            return flowAMock;
        }
    }
}
