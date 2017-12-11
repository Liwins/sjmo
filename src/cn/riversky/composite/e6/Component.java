package cn.riversky.composite.e6;

/**
 * 抽象的组件对象，添加对父节点的引用
 * Created by admin on 2017/12/6.
 */
public abstract class Component {
    /**
     * 记录父组件对象
     */
    private Component parent = null;

    public Component getParent() {
        return parent;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }

    /**
     * 输出组件自身的名称
     */
    public abstract void printStruct(String preStr);


    public  void addChild(Component c1){
        throw  new UnsupportedOperationException("buzhichi");
    }
}
