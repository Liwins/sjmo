package cn.riversky.yanmo.actiontype.visitor.e5.elem;

import cn.riversky.yanmo.actiontype.visitor.e5.visitor.Visitor;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/18.
 */
public class Leaf extends Component{
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        //回调访问者对象的相应方法
        visitor.leafVisit(this);
    }
}
