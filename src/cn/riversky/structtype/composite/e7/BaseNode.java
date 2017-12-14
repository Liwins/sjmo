package cn.riversky.structtype.composite.e7;

/**
 * Created by admin on 2017/12/6.
 */
public abstract class BaseNode {
    /**
     * 组件路径
     */
    private String compontPath="";

    public String getCompontPath() {
        return compontPath;
    }

    public void setCompontPath(String compontPath) {
        this.compontPath = compontPath;
    }
    /**
     * 获取组件的名称
     * @return 组件的名称
     */
    public abstract String getName();
    /**
     * 输出组件自身的名称
     */
    public abstract void printStruct(String preStr);
    /**
     * 向组合对象中加入组件对象
     * @param child 被加入组合对象中的组件对象
     */
    public void addChild(BaseNode child) {
        // 缺省的实现，抛出例外，因为叶子对象没有这个功能，或者子组件没有实现这个功能
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
}
