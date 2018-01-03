package cn.riversky.yanmo.actiontype.visitor.e5.elem;

import cn.riversky.yanmo.actiontype.visitor.e5.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public class Composite extends Component {
    /**
     * 用来存储组合对象中包含的子组件对象
     */
    private List<Component> childComponents = new ArrayList<Component>();
    /**
     * 组合对象的名字
     */
    private String name = "";

    public Composite(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 循环调用子组件的accept方法
     * @param visitor 访问者对象
     */
    @Override
    public void accept(Visitor visitor) {
       visitor.componentVisit(this);
        for(Component c:childComponents){
            c.accept(visitor);
        }
    }

    @Override
    public void addChild(Component child) {
        childComponents.add(child);
    }
}
