package cn.riversky.gitbook.action.interpreter.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/8.
 */
public class ActionNode extends AbstractNode {
    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public String interpret() {
        if(action.equalsIgnoreCase("move")) {
            return "移动";
        }else if(action.equalsIgnoreCase("run")){
            return "快速移动";
        }else {
            return "无效执行令";
        }
    }
}
