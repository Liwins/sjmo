package cn.riversky.gitbook.action.interpreter.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/8.
 */
public class DirectionNode extends AbstractNode {
    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    @Override
    public String interpret() {
        if(direction.equalsIgnoreCase("up")){
            return "向上";
        }else if(direction.equalsIgnoreCase("down")){
            return "向下";
        }else if(direction.equalsIgnoreCase("left")){
            return "向左";
        }else if(direction.equalsIgnoreCase("right")){
            return "向右";
        }else {
            return "无效指令";
        }
    }
}
